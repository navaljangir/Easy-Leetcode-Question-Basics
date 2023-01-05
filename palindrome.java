class Solution {
    public boolean isPalindrome(int x) {
        int remainder ; 
        int sum = 0; 
        if(x<0){
            return false; 
        }
        int number = x; 
        while(x>0 ){
        remainder = x %10 ; 
        sum = (sum *10)  + remainder; 
        x = x/10; 
        }
        if(sum == number ){
            return true; 

        }
        return false; 
    }
}
