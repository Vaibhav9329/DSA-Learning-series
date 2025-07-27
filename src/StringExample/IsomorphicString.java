package StringExample;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString  {
//    Example 1:
//    Input: s = "egg", t = "add"
//    Output: true
//    Explanation:
//
//    The strings s and t can be made identical by:
//
//    Mapping 'e' to 'a'.
//    Mapping 'g' to 'd'.

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
           char charS = s.charAt(i);
           char charT = t.charAt(i);

           if(m1.containsKey(charS)){
               if(m1.get(charS) != charT){
                   return false;
               }
           }else
           {
               if(m2.containsKey(charT)){
                   if(m2.get(charT) != charS){
                       return false;
                   }
               }else {
                   m1.put(charS,charT);
                   m2.put(charT,charS);
               }
           }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egd";
        String t = "add";

        System.out.println(isIsomorphic(s,t));
    }
}
