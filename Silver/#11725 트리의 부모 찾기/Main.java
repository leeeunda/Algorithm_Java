import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main{

	public static void main(String[] args) {

        //입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 

		// 트리 구조  그래프 구현
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++)
			graph.add(new ArrayList<>());

		// 그래프 입력
		for (int i = 0; i < n - 1; i++) {
			int n1 = sc.nextInt() - 1;
			int n2 = sc.nextInt() - 1;
			graph.get(n1).add(n2);
			graph.get(n2).add(n1);
		}

		boolean[] visit = new boolean[n]; // 방문 여부 확인용 배열
		int[] parentNode = new int[n]; // 부모 노드 저장 배열

		// BFS
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visit[0] = true;
		while (!queue.isEmpty()) {
			int v = queue.remove();
			for (int node : graph.get(v))
				if (!visit[node]) {
					visit[node] = true;
					queue.add(node);
					parentNode[node] = v; // 부모 노드 찾은 후 저장
				}
		}

		// 루트 노드를 제외한 나머지 노드의 부모 노드 출력
		for (int i = 1; i < n; i++)
			System.out.println(parentNode[i] + 1);
	}

}
