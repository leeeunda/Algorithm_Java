import java.util.*;

public class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length-1;
        int newElement=num_list[n]>num_list[n-1]?num_list[n]-num_list[n-1]:num_list[n]*2;
        int[] answer = Arrays.copyOf(num_list,n+2);
        answer[n+1]=newElement;
        
        return answer;
    }
}
