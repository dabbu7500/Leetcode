1class Solution {
2    public boolean exist(char[][] board, String word) {
3        
4        for(int i=0;i<board.length;i++)
5        {
6            for(int j=0;j<board[i].length;j++)
7            {
8                if(board[i][j]==word.charAt(0))
9                    {
10                        boolean ans =wordSearch(board,word,i,j,0);
11                        if(ans) return true;
12
13                    }
14            }
15        }
16        return false;
17    }
18    static boolean wordSearch(char[][] board,String word,int cr,int cc,int idx)
19    {
20        if(idx==word.length()) return true;
21        if(cr<0||cr>=board.length||cc<0||cc>=board[0].length||board[cr][cc]!=word.charAt(idx))
22        {
23            return false;
24        }
25        int []r={-1,1,0,0};
26        int c[]={0,0,-1,1};
27        board[cr][cc]='*';
28        for(int i=0;i<4;i++)
29        {
30            boolean ans=wordSearch(board,word,cr+r[i],cc+c[i],idx+1);
31            if(ans) return true;
32        }
33        board[cr][cc]=word.charAt(idx);
34        return false;
35    }
36}