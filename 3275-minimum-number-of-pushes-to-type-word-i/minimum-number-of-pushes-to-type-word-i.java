class Solution {
    public int minimumPushes(String word) {
        int c = 0;
        int n = word.length();
        for(int i=0;i<n;i++){
            c+=i/8+1;
        }
        return c;
    }
}