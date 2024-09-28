class Solution {
    public int singleNumber(int[] nums) {
        int i,j,c=0,max=0;
        for(i=0;i<nums.length;i++)
        {
            c=0;
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                max=nums[i];
            }
        }
        return max;
        
    }
}
