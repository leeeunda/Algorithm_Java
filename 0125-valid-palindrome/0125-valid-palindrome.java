class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}