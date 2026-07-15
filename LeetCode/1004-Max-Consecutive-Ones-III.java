class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0;
        int i=0;
        int j=0;
        int ans=Integer.MIN_VALUE;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                zeros++;
                
            }
            while(i<=j&&zeros>k)
            {
                if(nums[i]==0)
                zeros--;

                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}