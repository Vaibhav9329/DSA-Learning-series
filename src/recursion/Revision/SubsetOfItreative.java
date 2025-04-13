package recursion.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfItreative {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsetOfNumber(arr));
    }
        static List<List<Integer>> subsetOfNumber(int[] arr){
        List<List<Integer>> outerlist = new ArrayList<>();
        outerlist.add(new ArrayList<>());
        for(int i = 0 ; i<= arr.length-1;i++){

            int n = outerlist.size();
            for(int j=0;j<n;j++){
                List<Integer> innerlist = new ArrayList<>(outerlist.get(j));
                innerlist.add(arr[i]);
                outerlist.add(innerlist);
            }
        }
            return outerlist;
    }
}

