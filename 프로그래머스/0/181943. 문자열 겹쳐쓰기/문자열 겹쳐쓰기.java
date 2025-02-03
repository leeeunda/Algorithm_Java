class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] ms_array=my_string.toCharArray();
        char[] ow_array=overwrite_string.toCharArray();
        
        for (int i = 0; i < ow_array.length; i++) {
            ms_array[s + i] = ow_array[i];
        }
        return new String(ms_array);
    }
}