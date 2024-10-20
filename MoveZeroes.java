class Solution {
    public void moveZeroes(int[] nums) {
       int a=0;
       int c=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[a]=nums[i];
             a++;
        }
        if(nums[i]==0){
            c++;
        }
       }
        for(int i=0;i<c;i++){
            nums[a]=0;
            a++;
        }
       
    }
}