class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hmp = new HashMap<>();
        int cnt = 0;
        int i = 0;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            hmp.put(c,hmp.getOrDefault(c,0)+1);
            while(hmp.get(c)>2){
                char left = s.charAt(i);
                hmp.put(left,hmp.get(left)-1);
                i++;
            }
            cnt=Math.max(cnt,j-i+1);
        }
        return cnt;
    }
}