1class Solution {
2    public List<List<String>> partition(String s) {
3         List<List<String>> ans=new ArrayList<>();
4
5          List<String> list=new ArrayList<>();
6          palindromePartition(s,list,ans);
7          return ans;
8    }
9    static void  palindromePartition(String quest,List<String> list,List<List<String>> ans)
10    {
11        if(quest.length()==0)
12        {
13            ans.add(new ArrayList<>(list));
14            return;
15        }
16        for(int i=1;i<=quest.length();i++)
17        {
18            String s=quest.substring(0,i);
19            if(isPalindrome(s))
20            {
21                list.add(s);
22                palindromePartition(quest.substring(i),list,ans);
23                list.remove(list.size()-1);
24            }
25            
26        }
27       
28    }
29     static boolean isPalindrome(String s)
30        {
31            int l=0,r=s.length()-1;
32            while(l<r)
33            {
34                if(s.charAt(l)!=s.charAt(r))
35                return false;
36
37                l++;
38                r--;   
39                
40            }
41            return true;
42        }
43}