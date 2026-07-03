class Solution {
    public int countSubstrings(String s) {
        int c=0;
        //for odd 
        for(int axis=0;axis<s.length();axis++)
        {
            for(int orbit=0;axis-orbit>=0&&axis+orbit<s.length();orbit++)
            {
                if(s.charAt(axis-orbit)!=s.charAt(orbit+axis)) break;
                c++;
            }
        }  

        //for even
        for(double axis=0.5;axis<s.length();axis++)
        {
            for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++)
            {
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(orbit+axis))) break;
                c++;
            }
        }  
        return c;   
    }
}