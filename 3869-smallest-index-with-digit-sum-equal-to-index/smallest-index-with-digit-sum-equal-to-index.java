class Solution {
    public int smallestIndex(int[] nums) {
        int mi = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(i==s(nums[i])){
                mi = Math.min(mi,i);
            }
        }

        return mi==Integer.MAX_VALUE?-1:mi;
    }


    static int s(int n){
        int temp =n;
        int sum =0;
        while(temp>0){
            int digit = temp%10;
            sum+=digit;
            temp=temp/10;
        }
        return sum;
    }
}