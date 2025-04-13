package recursion.stringquestioin.Permutation;
//Given a string containing digits from 2-9 inclusive,
// return all possible letter combinations that the number could represent.
// Return the answer in any order.

//A mapping of digits to letters
// (just like on the telephone buttons) is given below.
// Note that 1 does not map to any letters.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfphoneNo {
//        public List<String> letterCombOfPhoneNo(String digits ){
//
//        }

        private void solve(int i,String digits, String s, List<String> ans,Map<Character,String> map)
        {
            if(i == digits.length()){
                ans.add(s);
                return;
            }
            char[] amp = map.get(digits.charAt(i)).toCharArray();
            for(char c : amp ){

            }
        }


        private Map<Character , String > getMap(){
            Map<Character,String> map = new HashMap<>();
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
            return map;
        }

    public static void main(String[] args) {

    }
}
