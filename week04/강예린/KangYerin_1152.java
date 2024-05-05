package until_0501;

import java.io.*;
    public class KangYerin_1152 {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
            String s =bf.readLine().trim();
            String [] arr = s.split(" ");
            if (s.isEmpty()){
                System.out.print(0);
            }
            else{
                System.out.print(arr.length);}
            bf.close();
        }
    }
