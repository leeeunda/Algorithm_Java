class Solution {
    public int[] solution(int[] num_list) {
        int n=num_list.length-1;
        return num_list[n] > num_list[n-1] ? num_list[n]-num_list[n-1]:2*num_list[n];
    }
}