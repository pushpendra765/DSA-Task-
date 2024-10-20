class Solution {
    public int majorityElement(int[] nums) {
      return helper(nums , 0 , nums[0]);
   }
   public int helper(int[] nums , int start , int majority){
       int n = nums.length , count=0;
       for(int i=start; i<n; i++){
           if(nums[i]==majority){
               count++;
           }else{
               count--;
           }
           if(count<0){
               return helper(nums , i , nums[i]);
           }
       }
       return majority;
   }
}
