public class Solution {
    public int solution(int a, int b, int c) {
        if(a == b && b == c) {
            return 27 * a * a * a * a * a * a;
        } else if(a == b || a == c || b == c) {
            int sum = a + b + c;
            int sumSquare = a * a + b * b + c * c;
            return sum * sumSquare;
        } else {
            return a + b + c;
        }
    }
}