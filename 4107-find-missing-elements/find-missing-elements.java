class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0];
        int b = nums[nums.length-1];

        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            l1.add(nums[i]);
        }

        for(int i=a+1;i<b;i++){
            if(!l1.contains(i)){
                l.add(i);
            }
            else{
                continue;
            }
        }
        return l;

    }
}