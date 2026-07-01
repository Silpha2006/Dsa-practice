class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount=0;

        for(int num:nums){
            if(num%2==0){
                evenCount++;
            }
        }
        int n=nums.length;
        int[] result=new int[n];

        for(int i=0;i<n;i++){
            if(i<evenCount){
                result[i]=0;
            }
            else{
                result[i]=1;
            }
        }
        return result;
    }
}
