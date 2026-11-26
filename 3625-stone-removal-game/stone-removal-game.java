class Solution {
    public boolean canAliceWin(int n) {
        int temp = 10;
        int i = 0;
        while(n>=temp){
            n-=temp;
            temp--;
            i++;
        }
        return i%2==1;
    }
}