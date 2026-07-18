class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int di = Integer.MIN_VALUE;
        for(int i=1;i<=nums[0];i++){
            if(nums[0]%i==0&&nums[nums.length-1]%i==0){
                di=i;
            }
        }

        return di;
    }
}