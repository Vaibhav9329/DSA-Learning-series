package recursion.Revision;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        System.out.println('A'+0);
        subsetrevision("","abcd");
        System.out.println(subsetrevisionArray("" , "abcd"));
    }
    static void  subsetrevision(String p , String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
         subsetrevision(p+ch,up.substring(1));
         subsetrevision(p,up.substring(1));

    }

    static ArrayList<String > subsetrevisionArray(String p , String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subsetrevisionArray(p+ch,up.substring(1));
       ArrayList<String> secod = subsetrevisionArray(p,up.substring(1));

      first.addAll(secod);
       return first;
    }
}
