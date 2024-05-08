package likelionjava.week05;

import java.util.ArrayList;
import java.util.Collections;
public class LottoShop {
        //손님이 낸 돈 (1000원 단위)
        public static int money = 0;

        public static void pay(int i) {
            money = i;
        }
        public static int pay() {
            return money;
        }
        //살 수 있는 로또
        public static int buyed() {
            return pay() / 1000;
        }

    // 자동 로또를 생성하는 메소드
    public static ArrayList<Integer> autoLotto() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> mylotto = new ArrayList<>();

        //배열 number에 숫자 1-45 저장
        Integer[] number = new Integer[45];
        for (int i = 0; i < 45; i++) {
            number[i] = i + 1;
        }
        //1-45를 배열리스트 numbers에 삽입
        for (int i = 0; i < number.length; i++) {
            numbers.add(number[i]);
        }

        //1-45 셔플
        Collections.shuffle(numbers);

        //1-45 셔플 한 것 중 앞에서 6개 추출-> 내 로또 번호 mylotto
        for (int i = 0; i < 6; i++) {
            mylotto.add(numbers.get(i));
        }

        Collections.sort(mylotto);

        return mylotto;
    }

    // 자동 로또를 구매한 수량만큼 제공하는 메소드
    public static ArrayList<ArrayList<Integer>> autoLottos(int buyed) {

        ArrayList<ArrayList<Integer>> mylottos = new ArrayList<>();

        for (int j = 0; j < LottoShop.buyed(); j++) {
            mylottos.add(autoLotto());
            //mylottos배열리스트에 로또수량만큼 autolotto 생성해서 엘리먼트로 삽입
        }

        return mylottos;
    }

    //내가 산 로또를 저장하는 메소드
    public static void buyingLotto() {
            ArrayList<ArrayList<Integer>> buyedLotto = new ArrayList<ArrayList<Integer>>();

            buyedLotto =autoLottos(buyed());

//            for (int i = 0; i < buyed(); i++) {
//                System.out.println(buyedLotto.get(i));
//            }

            Lotto.myLottos = buyedLotto;
        }

        // 당첨 확인
        public static void lottoPrize() {

            CountLotto cl = resulting();
            float percentage = revenue(cl) * 100;

            System.out.println("\n결과는");
            System.out.println(" ");

            System.out.println("5등: 3개 일치 (5,000원)- " + (int) cl.getFifth() + "개");
            System.out.println("4등: 4개 일치 (50,000원)- " + (int) cl.getFourth() + "개");
            System.out.println("3등: 5개 일치 (1,500,000원)- " + (int) cl.getThird() + "개");
            System.out.println("2등: 5개+보너스 일치 (30,000,000원)- " + (int) cl.getSecond() + "개");
            System.out.println("1등: 6개 일치 (2,000,000,000원)- " + (int) cl.getFirst() + "개");

            System.out.println("수익률: " + percentage + "%입니다.");

        }

        // 수익률을 계산
        public static float revenue(CountLotto cl) {

            float revenue = (cl.getFifth() * 5000+cl.getFourth() * 50000 + cl.getThird() * 1500000
                    + cl.getSecond() * 30000000 + cl.getFirst() * 2000000000) / (float)money;

            return revenue;
        }

        // 로또 당첨 번호 콤마로 구분하여 스트링 타입 배열에 저장
        public static String[] getLottoNumber() {
//
            String[] splited = Lotto.lottonumber.split(", ");

            return splited;

//            String[] lottoNumbers = {"1", "7", "14", "20", "33", "42"};
//            return lottoNumbers; //test
        }

        // 당첨 번호와 대조하는 메소드
        public static int count = 0, bonusCount=0;
        public static void trueNumber(ArrayList<Integer> arrayList, String[] splited) {
            int truenum = 0;

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (arrayList.get(i).toString().equals(splited[j])) {
                        truenum += 1;
                        break;
                    } else if (arrayList.get(i).toString().equals(RandomLotto.getBonus())) {
                        bonusCount++;
                    }
                }
            }
            count = truenum;
        }

        // 당첨 번호와 대조
        public static CountLotto resulting() {

            CountLotto c = new CountLotto();

            ArrayList<Integer> NowLottos = new ArrayList<Integer>();

            for (int i = 0; i < buyed(); i++) {
                NowLottos = (ArrayList<Integer>)Lotto.myLottos.get(i);
                //현재 가진 로또에서 로또 번호를 하나씩 꺼내고
                //현재 가진 로또와 실제 당첨 번호 비교 메소드 호출
                trueNumber((ArrayList<Integer>) NowLottos, getLottoNumber());

                if (count == 6) {
                    c.setFirst(c.getFirst() + 1);
                } else if (count == 5) {
                    if (bonusCount==1) {
                        c.setSecond(c.getSecond() + 1);
                    } else {
                        c.setThird(c.getThird() + 1);
                    }
                } else if (count == 4) {
                    c.setFourth(c.getFourth() + 1);
                } else if (count == 3) {
                    c.setFifth(c.getFifth() + 1);
                } else {

                }
            }

            return c;
        }



    }
