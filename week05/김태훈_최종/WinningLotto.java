import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WinningLotto{
    //당첨번호 받기
    static Scanner scf = null;
    static int[] win_num = new int[7]; //당첨번호 저장
    static int bonusnum = 0;  //보너스 번호
    public static void winninglotto() { //파일 읽는 메서드
        try { //파일 불러오기
            scf = new Scanner(new File("./src/Winning_Number.txt"));
        } catch (NumberFormatException e) { //숫자 외의 문자가 있을 때
            System.out.println("당첨 번호는 숫자만 가능합니다.");
        } catch (FileNotFoundException e) { //파일 경로가 잘못 되었을 때
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (Exception e){ //그 외의 에러
            System.out.println("[Error]");
        }

        int flag = 0; //보너스 걸러주기 위한 카운트용 변수
        while(scf.hasNextInt()){ //txt파일 뒤에 수가 없을 때까지 반복해서 읽기
            if(flag==6){ //보너스 번호 따로 받기
                bonusnum = scf.nextInt();
                //System.out.println(bonusnum);
            } else { //당첨 번호 6개 받아서 저장
                win_num[flag] = scf.nextInt();
                //System.out.println(win_num[flag]);
                flag++;
            }
        }
    }

    public static int[] getWinnum(){ //당첨번호 get
        return win_num;
    }

    public static int getBonusnum() { //보너스 번호 get
        return bonusnum;
    }
}
