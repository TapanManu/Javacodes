class Solution {
    static int len=0;
    static int count=0;
    public int removeDuplicates(int[] nums) {
        int[] test = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                //System.out.println(nums[i]);
                test[count++]=nums[i];
            }
        }
            test[count++]=nums[nums.length-1];
        
        for(int i=0;i<test.length;i++)
            nums[i]=test[i];
        return count;
    }
}
