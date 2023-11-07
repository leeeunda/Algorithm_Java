import java.util.Queue;
import java.util.LinkedList;
 
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = in.nextInt(); // 입력 카드 갯수
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i); //맨 위 카드를 버림
		}
		
		
		while(queue.size() > 1) { //원소가 한 개 남을 때까지 
			queue.poll();	//그 다음으로 맨 앞에 있는 카드 버림 
			queue.offer(queue.poll());	// 맨 앞의 카드를 버리면서 맨 아래의 카드로 옮김 
		}
		
		System.out.println(queue.poll());	// 마지막으로 남은 카드 출력
	}
}