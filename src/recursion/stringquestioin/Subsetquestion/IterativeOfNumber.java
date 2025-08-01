package recursion.stringquestioin.Subsetquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeOfNumber {

    static List<List<Integer>> subsSetOfInteger(int[] arr){
        List<List<Integer>>  outerlist = new ArrayList<>();
        outerlist.add(new ArrayList<>());

        for(int num : arr){
            int size = outerlist.size();
            for(int i=0;i<size;i++){
                List<Integer> innerlist = new ArrayList<>(outerlist.get(i));
                innerlist.add(num);
                outerlist.add(innerlist);
            }
        }
        return outerlist;
    }


    public static void main(String[] args) {
        int[] arr= {1,2,3};
       // subsSetOfInteger(arr);
        System.out.println(subsSetOfInteger(arr));
    }
}
