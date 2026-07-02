class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>(); 
        Arrays.sort(nums);
      
        subset(nums,0,list,ans);
        return ans;

    }
    static void subset(int []nums,int idx,List<Integer> list,List<List<Integer>> ans)
    {
       
        
        ans.add(new ArrayList<>(list));
         if(idx==nums.length)
        return;
        for(int i=idx;i<nums.length;i++)
        {

            if(i>idx && nums[i]==nums[i-1]) continue;

            list.add(nums[i]);
            subset(nums,i+1,list,ans);
            list.remove(list.size()-1);
        }

    }
}