class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int a=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=1){
            a=0;
        }else{
            a++;
        }
        max=Math.max(a,max);
        
      }
      return max;
    }
}