package until_0501;

import java.io.*;
public class KangYerin_2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));

        String[] s= bf.readLine().split(" ");
        int n= Integer.parseInt(s[0]);
        int m= Integer.parseInt(s[1]);
        int[][] mat1 = new int [n][m];
        for (int i=0; i<n; i++){
            s= bf.readLine().split(" ");
            for (int j=0; j<m; j++){
                mat1[i][j]= Integer.parseInt(s[j]);
            }
    }
        for (int i=0; i<n; i++){
            s= bf.readLine().split(" ");
            for (int j=0; j<m; j++){
                System.out.print((Integer.parseInt(s[j])+ mat1[i][j])+" ");
            }
            System.out.println();
        }
        bf.close();
    }

}
