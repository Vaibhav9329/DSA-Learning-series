package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

        public static String minWindow(String s, String t){
                if(s.length() < t.length()){
                    return "";
                }

                Map<Character , Integer> mp = new HashMap<>();
                for(char c : t.toCharArray()){
                    mp.put(c, mp.getOrDefault(c,0)+1);
                }

            Map<Character , Integer> window = new HashMap<>();
                int have= 0, mpsize = mp.size();
                int left = 0, minLen = Integer.MAX_VALUE, minStart = 0;

                for(int rg = 0;rg<s.length();rg++){
                    char c = s.charAt(rg);
                    window.put(c,window.getOrDefault(c,0)+1);


                    if(mp.containsKey(c) && window.get(c).intValue() == mp.get(c).intValue()){
                        have++;
                    }
                    while (have == mpsize){
                        if(rg - left +1 < minLen ){
                            minLen =rg-left+1;
                            minStart = left;
                        }
                        char leftChar = s.charAt(left);
                        window.put(leftChar, window.get(leftChar) - 1);
                        if (mp.containsKey(leftChar) && window.get(leftChar).intValue() < mp.get(leftChar).intValue())
                            have--;

                        left++;
                    }

                }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

        }

    public static void main(String[] args) {
        String s = "ABBAACDBCAB";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
