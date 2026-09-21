class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res= new int [nums.length*2];
        for(int i=0;i<nums.length*2;i++){

            //this is the calc which is imp
            res[i]=nums[i%nums.length];
        }
        return res;
    }
}