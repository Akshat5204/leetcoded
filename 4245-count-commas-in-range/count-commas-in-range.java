class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int count = 0;
        int quotient = n/1000;
        int rem = n%1000;

        return(quotient - 1)*1000+rem+1;
    }
}