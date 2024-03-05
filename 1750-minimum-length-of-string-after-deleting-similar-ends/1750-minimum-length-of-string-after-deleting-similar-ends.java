class Solution {
    public int minimumLength(String s) {
        int first =0 ;
        int last = s.length()-1;
        while(first<last&& s.charAt(first)==s.charAt(last)){
            char cm =s.charAt(first);
            while(first<=last&&s.charAt(first)==cm){
                first++;
            }
            
             while(first<=last&&s.charAt(last)==cm){
                last--;
            }
        }
     return last-first+1;
    }
}