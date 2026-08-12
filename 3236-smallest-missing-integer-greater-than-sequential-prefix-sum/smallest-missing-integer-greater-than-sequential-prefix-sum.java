class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int p:nums){
            set.add(p);
        }
        int sum = nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]-1==nums[i-1]){
                sum+=nums[i];
            }
            else{
                break;
            }
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}