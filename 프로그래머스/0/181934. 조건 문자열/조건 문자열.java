class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String answer = ineq + eq;
        
        return (answer.equals("<=") ? (n <= m) :
                answer.equals(">=") ? (n >= m) :
                answer.equals("<!") ? (n < m) :
                answer.equals(">!") ? (n > m) : false) ? 1 : 0;
    }
}
