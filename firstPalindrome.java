class Solution {
    public boolean isPalin(String wrd){
        StringBuffer buf= new StringBuffer(wrd);
        String st=buf.reverse().toString();
        if(wrd.equals(st)){
            return true;
        }
        else{
            return false;
        }
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(String wrd: words){
            if(isPalin(wrd)){
                ans=wrd;
                break;
            }
        }
        return ans;
    }
}
