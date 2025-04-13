package recursion.stringquestioin.Permutation;

import java.util.ArrayList;

public class PadNumberToLetters {
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'1';
        ArrayList<String> listnew = new ArrayList<>();

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
           listnew.addAll( pad(p+ch,up.substring(1)));
        }
        return listnew;
    }

    public static void main(String[] args) {
        System.out.println(pad("","29"));
        System.out.println(pad("","29").size());
    }
}
