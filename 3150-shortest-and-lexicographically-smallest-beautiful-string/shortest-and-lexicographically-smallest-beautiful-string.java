class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();

        for(int i=0;i<n;i++){
            int curones = 0;
            StringBuilder cur = new StringBuilder();

            for(int j=i;j<n;j++){
                cur.append(s.charAt(j));
                if(s.charAt(j)=='1'){
                    curones++;
                }
                if(curones>k){
                    break;
                }
                if(curones==k){
                    String str = cur.toString();

                    if(ans.isEmpty()||str.length()<ans.length()||str.length()==ans.length()&&str.compareTo(ans)<0){
                        ans=str;
                    }
                }
            }

        }

        return ans;
    }
}