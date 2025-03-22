import java.util.*;

public class Solution {
    public static List<Integer> solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("5");

        while (!queue.isEmpty()) {
            String numStr = queue.poll();
            int num = Integer.parseInt(numStr);

            if (num >= l && num <= r) {
                result.add(num);
            }

            if (num > r) continue;

            queue.add(numStr + "0");
            queue.add(numStr + "5");
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        Collections.sort(result);
        return result;
    }
}
