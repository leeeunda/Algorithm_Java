class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int j=0;j<queries.length;j++){
            int s=queries[j][0], e=queries[j][1], k=queries[j][2];
            for(int i=s;i<e+1;i++){
                if(i%k==0){
                    arr[i]+=1;
                }
            }
        }
        return arr;
    }
}