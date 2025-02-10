class Solution {
    public int solution(int a, int b) {
        String str_a=Integer.toString(a);
        String str_b=Integer.toString(b);
        return Math.max(Integer.parseInt(str_a+str_b), 2*a*b);
    }
}