class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
       reverse(nums,0,nums.length-1);
       reverse(nums,0,d-1);
       reverse(nums,d,nums.length-1);
        
    }
    public void reverse(int []arr,int st, int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
}