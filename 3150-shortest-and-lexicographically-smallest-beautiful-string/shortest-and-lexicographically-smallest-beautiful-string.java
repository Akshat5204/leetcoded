class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();

        for(int i=0;i<n;i++){
            int curones=0;
            StringBuilder str = new StringBuilder();
            for(int j=i;j<n;j++){
                str.append(s.charAt(j));
                if(s.charAt(j)=='1'){
                    curones++;
                }

                if(curones>k){
                    break;
                }
                if(curones==k){
                    String cur = str.toString();
                    
                    if(ans.isEmpty()||cur.length()<ans.length()||cur.length()==ans.length()&&cur.compareTo(ans)<0){
                        ans=cur;
                    }
                }
            }
        }
        return ans;
    }
}