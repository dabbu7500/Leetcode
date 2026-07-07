class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        if(nums.length==0)
        return new ArrayList<>(ans);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(start<end)
            {
                int sum=nums[start]+nums[end];
                if(sum==-nums[i])
                {
                    ans.add(Arrays.asList(nums[i],nums[start++],nums[end--]));

                }
                else if(sum>-nums[i])
                end--;
                else 
                start++;

            }

        }
        return new ArrayList<>(ans);
    }
}