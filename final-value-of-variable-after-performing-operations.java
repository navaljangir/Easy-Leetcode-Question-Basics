class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = 0; 
        for(int i = 0 ; i<operations.length ; i++){
           if(operations[i].charAt(1) == '+'){
               n++;
           }
        else{
            n--;
        }
        }
        return n ; 

    }
}
