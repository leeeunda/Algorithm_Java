class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<numLog.length-1;i++){
            int n=numLog[i+1]-numLog[i];
            answer.append(n==1?"w":n==-1?"s":n==10?"d":"a");
        }
        return answer.toString();
    }
}