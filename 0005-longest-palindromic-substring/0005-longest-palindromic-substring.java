class Solution {
    public String longestPalindrome(String s) {
        int size=s.length();
        if (size<2) {   // return string if 1 char
            return s;
        }

        int start=0, end=0;
        for (int i=0;i<size;i++) {  // i acts as the center of the palindrome
            int len = Math.max(fromCenter(s, i, i), fromCenter(s, i, i+1));     // find maximum length of palindrome
            if (len > end-start+1) {    // find start & end of palindrome from center
                start = i - ((len-1)/2);
                end = i + len/2;
            }
        }

        return s.substring(start, end+1);
    }

    private int fromCenter(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;     // expand right
            right++;    // expand left
        }
        return right-left-1;    // return length of palindrome
    }
}