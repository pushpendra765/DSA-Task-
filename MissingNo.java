class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int a=print(nums,0);
        return a;
    }
    public static int  print(int[] a,int i){
       
        if(i==a.length){
          
            return i ;
        }
        if(i!=a[i]){
          
            return i;
        }
        return print(a,i+1);
     

    }
}
