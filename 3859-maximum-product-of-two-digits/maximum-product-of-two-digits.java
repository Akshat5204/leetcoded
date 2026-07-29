class Solution {
    public int maxProduct(int n) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        while(n>0){
            int rem = n%10;
            if(rem>=m1){
                m2=m1;
                m1=rem;
            }
            else if(rem>=m2){
                m2=rem;
            }
            n=n/10;
        }

        return m1*m2;
    }
}