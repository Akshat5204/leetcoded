class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallestodd = Integer.MAX_VALUE;

        for(int num:nums1){
            if(num%2==1){
                smallestodd = Math.min(smallestodd,num);
            }
        }

        if(smallestodd==Integer.MAX_VALUE){
            return true;
        }

        for(int num:nums1){
            if(num%2==0 && num<=smallestodd){
                return false;
            }
        }
        return true;
    }
}