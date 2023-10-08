import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15]; //2차원 배열 이용
        int max = 0;
        
        for (int i = 0; i < ch.length; i++) { //이중 for문 이용
            String str = br.readLine();
            if(max < str.length()) max = str.length(); //최대 길이를 max 변수에 저장
            
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\0') continue; //char 배열의 초기값일 경우 넘어감
                sb.append(ch[j][i]); //열과 행으로 출력
            }
        }
        System.out.println(sb); //세로로 배열한 글자들을 출력
    }
}