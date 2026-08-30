class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minpos = -1;
        int maxpos = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
                minpos=i;
            }
                if(nums[i]>=max){
                max=nums[i];
                maxpos=i;
            }
        }
        int front = Math.max(minpos,maxpos)+1;

        int back = nums.length-Math.min(minpos,maxpos);

        int both = nums.length-Math.max(minpos,maxpos)+Math.min(minpos,maxpos)+1;
        return Math.min(front,Math.min(back,both));    
    }
}