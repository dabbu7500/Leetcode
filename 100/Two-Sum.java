1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int a=0,b=0;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++)
6        {
7            int require=target-nums[i];
8            if(!map.containsKey(require))
9            {
10                map.put(nums[i],i);
11            }
12            else{
13                a=i;
14                b=map.get(require);
15
16
17            }
18        }
19        return new int[]{a,b};
20    }
21}