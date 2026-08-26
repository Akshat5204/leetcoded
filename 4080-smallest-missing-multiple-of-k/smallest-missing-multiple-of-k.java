class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int num = k;
        while(s.contains(num)){
            num=num+k;
        }
        return num;
    }
}