class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 1) { 
                sb1.append(num);
            } else {
                sb2.append(num);
            }
        }
        int oddNum = sb1.length() == 0 ? 0 : Integer.parseInt(sb1.toString());
        int evenNum = sb2.length() == 0 ? 0 : Integer.parseInt(sb2.toString());

        return oddNum + evenNum;
    }
}
