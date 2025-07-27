package slidingWindow;

import java.util.HashMap;

public class LongestSubStringUnique {
    public static int longestSubstring(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int n = s.length();
        int maxlen = 0;
        int left =0;

        for (int right =0;right<n;right++){
            if(!mpp.containsKey(s.charAt(right)) || mpp.get(s.charAt(right)) < left){
                mpp.put(s.charAt(right), right);
                maxlen = Math.max(maxlen, right-left+1);
                }else {
                left = mpp.get(s.charAt(right))+1;
                mpp.put(s.charAt(right),right);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcecdeee";
        System.out.println(longestSubstring(s));
    }
}
