class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        long sum=0;
        int i=0;
        int j=0;
        HashSet<Integer> set=new HashSet<>();
        while(j<nums.length)
        {
            sum+=nums[j];
            while(set.contains(nums[j]))
            {
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }

            if((j-i+1)==k)
            {
                ans=Math.max(ans,sum);
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            j++;
            
        }
        return ans;
    }
}