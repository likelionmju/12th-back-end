package until_0501;

import java.io.*;

public class KangYerin_10809 {

            public static void main(String[] args) throws IOException {
                BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
                String s= bf.readLine();
                for(int i=0; i<26; i++) {
                    System.out.print(s.indexOf('a'+i)+" ");
                }
                bf.close();
            }
        }


