import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

				//입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				//출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				//한줄 씩 입력값 읽어오기
        String string = br.readLine();

				//접미사 배열 선언
        String[] strArray = new String[s.length()];
				
        for (int i = 0; i < s.length(); i++) {
            strArray[i] = s.substring(i, s.length());
        }

				//사전 순 정렬
        Arrays.sort(strArray);

				//출력
        for (String str : strArray) {
            bw.write(str);
            bw.write('\n');
        }

        bw.flush();
    }
}
