class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int ls = 0,rs = 0,lq = 0,rq = 0;
        for(int i=0;i<n;i++){
            char c = num.charAt(i);
            if(i<n/2){
                if(c=='?'){
                    lq++;
                }
                else{
                    ls+=c-'0';
                }
            }
            else{
                if(c=='?'){
                    rq++;
                }
                else{
                    rs+=c-'0';
                }
            }
        }

        if((lq+rq)%2==1) return true;
        return ls-rs!=(rq-lq)*9/2;
        
    }
}