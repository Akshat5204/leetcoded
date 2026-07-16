class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);

        for(int len = l.length();len<=h.length();len++){
            for(int start = 0;start<=9-len;start++){
                int n = Integer.parseInt(s.substring(start,start+len));
                if(n>=low&&n<=high){
                    ans.add(n);
                }
            }
        }
        return ans;
    }
}