package until_0501;

import java.io.*;
    public class KangYerin_10988 {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            String s=br.readLine();
            int anw = 1;
            for (int i=0; i<s.length()/2;i++) {
                if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                    anw=0;
                }
            }
            System.out.print(anw);
            br.close();
        }
    }
