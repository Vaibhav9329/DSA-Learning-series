package recursion.stringquestioin.Subsetquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplElementInArray {

    static List<List<Integer>> SubsetWithDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerlist = new ArrayList<>();
        outerlist.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){

            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outerlist.size()-1;
            int n = outerlist.size();
            for(int j=start; j<n;j++){
                List<Integer> interalList = new ArrayList<>(outerlist.get(j));
                interalList.add(arr[i]);
                outerlist.add(interalList);
            }
        }
        return outerlist;
    }

    static List<List<Integer>> subSetWithDuplicates(int[ ] arr){
        List<List<Integer>> outlist = new ArrayList<>();
        outlist.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length;i++){
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outlist.size()-1;
            int n = outlist.size();
            for(int j=start;j<n;j++){
                List<Integer> innerlist = new ArrayList<>(outlist.get(j));
                innerlist.add(arr[i]);
                outlist.add(innerlist);
            }
        }
        return outlist;
    }



    public static void main(String[] args) {
    int[] arr={1,2,2};
//       List<List<Integer>> ans = SubsetWithDuplicate(arr);
//       for(List<Integer> list : ans) {
//           System.out.println(list);
//       }
       List<List<Integer>>  asns = subSetWithDuplicates(arr);
       for (List<Integer> list : asns){
           System.out.println(list);
       }
    }
}
