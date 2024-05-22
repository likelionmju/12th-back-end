package LottoProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    BufferedReader reader;
    // 당첨번호 넣을 배열
    private int[] ansnum = new int[6];
    // 보너스 넘버
    private int bnum;

    // 생성자에서 ,로 구분되어있는 lotto.txt 파일 읽기
    public FileRead() {
        try {
            // 버퍼리더로 한 라인 읽고 split로 문자배열에 저장해서 마지막 숫자는 보너스 넘버에 6개 숫자는 당첨번호 배열에 넣음
            reader = new BufferedReader(new FileReader("C:\\Users\\강예린\\Documents\\lotto.txt"));
            String line = reader.readLine();
            if (line != null) {
                String[] s = line.split(",");
                for (int i = 0; i < 6; i++) {
                    ansnum[i] = Integer.parseInt(s[i]);
                }
                bnum= Integer.parseInt(s[6]);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

    public int[] getAnsnum() {
        return ansnum;
    }

    public int getBnum() {
        return bnum;
    }
}
