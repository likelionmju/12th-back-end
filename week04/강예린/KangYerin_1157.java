package until_0501;

import java.io.*;
import java.util.Arrays;
public class KangYerin_1157 {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            String s=br.readLine().toUpperCase();
            int[] alp = new int[26];
            int [] count = new int [26];
            for (int i=0; i<alp.length;i++) {
                alp[i]= 'A'+i;
                count[i]=0;
            }
            for (int i=0; i<s.length();i++) {
                for (int k=0; k< alp.length;k++) {
                    if (s.charAt(i)== alp[k]) {
                        count[k]++;
                    }
                }

            }
            int max=0;
            int index=0;
            for (int i=0;i<count.length;i++) {
                if (count[i]>max) { max= count[i];
                    index=i;
                }
            }
            Arrays.sort(count);
            if(count[25]==count[24]) System.out.print("?");
            else System.out.print((char)alp[index]);
            br.close();
        }
    }

