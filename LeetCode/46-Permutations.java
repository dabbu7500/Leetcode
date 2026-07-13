class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean visited[]= new boolean[nums.length]; 
        permutation(nums,ans,list,visited);
        return ans;
    }
    static void permutation(int []nums,List<List<Integer>> ans,List<Integer> list,boolean visited[])
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]) continue;

            list.add(nums[i]);
            visited[i]=true;
            permutation(nums,ans,list,visited);
            list.remove(list.size()-1);
            visited[i]=false;
        }
    }
}