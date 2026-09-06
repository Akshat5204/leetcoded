class Solution {

    // public int numDistinct(String s, String t) {
    //     int i=s.length();
    //     int j=t.length();
    //     int ans=func(s,t,i,j);
    //     return ans;
    // }

    // public int func(String s,String t,int i,int j){ 
    //     if(j==0){
    //         return 1;
    //     }
    //     if(i==0){
    //         return 0;
    //     }

    //     if(s.charAt(i-1)==t.charAt(j-1)){
    //        return func(s,t,i-1,j-1)+func(s,t,i-1,j);
    //     }
    //     return func(s,t,i-1,j);
    // }

    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

}