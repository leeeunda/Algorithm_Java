import java.util.Stack;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = in.nextInt(); //입력 개수
		
		for(int i = 0; i < K; i++) {
			int number = in.nextInt(); //정수 입력
            
			if(number == 0) {	// 0이라면 스택에 저장된 top 원소를 지운다.
				stack.pop();
			}
			else {
				stack.push(number); //0이 아닌 경우 stack에 원소 추가
			}
		}
		int sum = 0;
		
		for(int o : stack) {
			sum += o; //스택에 담겨있는 원소 합
		}
 
		System.out.println(sum);	//원소 합 출력
	}
 
}