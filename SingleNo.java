class Solution {
    public int singleNumber(int[] nums){
        Arrays.sort(nums);
       int a=1;
       //int res=0;
       int n=nums.length;
       for(int i=0;i<n-1 ;i++){
            if(nums[i]!=nums[i+1]){
                if(a!=2){

                    return nums[i];
                }else{
                    a=1;
                }
            }
            if(nums[i]==nums[i+1]){
                a++;
            }
       }
    return nums[nums.length-1];
    }
}