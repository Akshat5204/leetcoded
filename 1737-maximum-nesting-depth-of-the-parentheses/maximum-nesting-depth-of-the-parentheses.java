class Solution {
    public int maxDepth(String s) {
        int dep = 0; // depth represents (
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                dep++;
                max=Math.max(max,dep);
            }
            else if(s.charAt(i)==')'){
                dep--;
            }
        }

        return max;
    }
}