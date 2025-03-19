class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int q=0;q<queries.length;q++){
            int s=queries[q][0], e=queries[q][1], k=queries[q][2];
            int minValue=Integer.MAX_VALUE;

            for (int i=s;i<e+1;i++){
                if(arr[i]>k&&arr[i]<minValue){
                    minValue=arr[i];
                }
            }
            answer[q]=(minValue==Integer.MAX_VALUE)?-1:minValue;
        }
        return answer;
    }
}