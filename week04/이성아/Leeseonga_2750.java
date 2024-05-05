import java.util.*;

public class Leeseonga_2750 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("수의 개수를 입력하시오.");
        int num = scn.nextInt();

        System.out.println("각각의 수를 입력하시오.");
        for (int i = 0; i < num; i++) {
            int nums = scn.nextInt();
            list.add(nums);
        }

        Collections.sort(list);
        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }
        scn.close();
    }
}