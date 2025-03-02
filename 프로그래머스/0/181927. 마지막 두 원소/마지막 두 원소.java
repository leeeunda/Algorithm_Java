public class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int last = num_list[size - 1];
        int secondLast = num_list[size - 2];
        int newElement = last > secondLast ? last - secondLast : last * 2;

        int[] answer = new int[size + 1];
        System.arraycopy(num_list, 0, answer, 0, size);
        answer[size] = newElement;

        return answer;
    }
}
