class Solution {
    public long countCommas(long n) {
        if(n<999){
            return 0;
        }

        long totalc = 0;
        long start = 1000;

        while(start<=n){
            totalc+=n-start+1;
            start*=1000;
        }

        return totalc;
    }
}