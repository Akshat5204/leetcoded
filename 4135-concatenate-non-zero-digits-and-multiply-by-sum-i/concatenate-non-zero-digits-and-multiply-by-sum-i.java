class Solution {
    public long sumAndMultiply(int n) {
        long s = 0;
        long c = 0;
        Stack<Integer> st = new Stack<>();
        while(n>0){
            int m = n%10;
            if(m!=0){
                st.push(m);
            }
            n/=10;
        }

        while(!st.isEmpty()){
            int p = st.pop();
            s+=p;
            c=c*10+p;
        }

        return c*s;
    }
}