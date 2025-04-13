package recursion.stringquestioin.dice;

import java.util.ArrayList;

public class Dice {
    static ArrayList<String> dice(String p, int targert ){
        if(targert == 0 ){
           ArrayList<String > list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String  > nwlist=new ArrayList<>();
        for(int i=1;i<=6 && i<=targert;i++){
            nwlist.addAll(dice(p+i,targert-i));
        }
        return nwlist;
    }
    public static void main(String[] args) {
        System.out.println(dice("",6  ));
    }
}
