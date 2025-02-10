class Solution {
    public int solution(int a, int b) {
        String str_a=Integer.toString(a);
        String str_b=Integer.toString(b);
        
        String str1=str_a+str_b;
        String str2=str_b+str_a;
        
        if (Integer.parseInt(str1)>Integer.parseInt(str2)){
            return Integer.parseInt(str1);
        } else return Integer.parseInt(str2);        
    }
}