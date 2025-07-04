package recursion.stringquestioin.Permutation;

import java.util.ArrayList;

public class LetterCombArraylist {

    public static ArrayList<String> subSeqList(String p, String up ){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String  > listd = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
         listd.addAll(subSeqList(f+ch+s,up.substring(1)));
       }
        return listd;
    }

    public static void main(String[] args) {
        ArrayList<String> result = subSeqList("","abc");
        System.out.println(result);
    }

}
