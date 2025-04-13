package recursion.stringquestioin.Permutation;

import java.util.ArrayList;

public class PermutationString {
    static void permutation(String p, String ch) {
        if (ch.isEmpty()) {
            System.out.println(p);
            return;
        }
        char st = ch.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + st + s, ch.substring(1));
        }
    }

    static ArrayList<String> permutationlist(String p, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(permutationlist(f + ch + s,str.substring(1)));

        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }


    public static void main(String[] args) {
        permutation("","abc");
//        System.out.println(permutationlist("", "cba"));
//        System.out.println(permutationsCount("" , "abc"));
    }
}
