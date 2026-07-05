class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char [][] board=new char[n][n];
        queen(board,0,ans,n);
        return ans;

    }
    static void queen(char [][] board,int row,List<List<String>> ans,int tq)
    {
        if(tq==0)
        {
            saveBoard(board,ans);
            return;
        }

        for(int col=0;col<board.length;col++ )
        {
            if(isItSafe(board,row,col))
            {
                board[row][col]='Q';
                queen(board,row+1,ans,tq-1);
                board[row][col]='.';
            }
        }
    }
    static boolean isItSafe(char [][] board,int row,int col)
    {
        int r=row;
        while(row>=0)
        {
            if(board[row][col]=='Q')
            return false;
            row--;
            
        }
        row=r;
        int c=col;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
            return false;
            row--;
            col--;
            
        }
        row=r;
        col=c;
        while(row>=0 && col<board.length)
        {
            if(board[row][col]=='Q')
            return false;
            row--;
            col++;
            
        }
        return true;
    }

    static void saveBoard(char [][]board,List<List<String>>ans)
    {
        
        List<String> list=new ArrayList();
        for(int i=0;i<board.length;i++)
        {
            String row="";
            for(int j=0;j<board.length;j++ )
            {
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+='.';
            }
            list.add(row);
        }
        ans.add(list);
    }


}