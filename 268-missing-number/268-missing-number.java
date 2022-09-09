class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int total=(len*(len+1))/2;
        int sumOfArr=0;
        for(int i=0;i<nums.length ;i++){
           sumOfArr+=nums[i];
        }
        return total-sumOfArr;
    }
}