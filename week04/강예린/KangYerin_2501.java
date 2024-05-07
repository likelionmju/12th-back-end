package until_0501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class KangYerin_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        String s = br.readLine();
        int n= Integer.parseInt(s.split(" ")[0]);
        int k= Integer.parseInt(s.split(" ")[1]);
        for (int i=1; i<=n; i++){
            if (n % i ==0) al.add(i);
        }

        if (k <= al.size()) System.out.println(al.get(k-1));
        else System.out.println(0);
    }
}
