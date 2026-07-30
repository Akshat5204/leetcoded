class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten=0;
        for(int b:bills){
            if(b==5){
                five++;
                continue;
            }
            else if(b==10){
                if(five==0){
                    return false;
                }
                ten++;
                five--;
                continue;
            }
            else{
                if(five>0&&ten>0){
                    five--;
                    ten--;
                }
                else if(five>2){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}