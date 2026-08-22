class Solution {
    public boolean checkDivisibility(int n) {
        int pro = 1;
        int sum = 0;
        int temp = n;
        while(n>0){
            int re = n%10;
            sum+=re;
            pro*=re;
            n=n/10;
        }
        if(temp%(sum+pro)==0){
            return true;
        }
        return false;

    }
}