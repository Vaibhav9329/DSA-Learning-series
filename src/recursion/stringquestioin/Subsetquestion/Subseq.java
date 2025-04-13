package recursion.stringquestioin.Subsetquestion;

import java.util.ArrayList;

public class Subseq {
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p );
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqInlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqInlist(p+ch, up.substring(1));
        ArrayList<String> right = subseqInlist(p,up.substring(1));


        left.addAll(right);
       return left;
    }



    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseqInlist("","abc"));
    }
}
