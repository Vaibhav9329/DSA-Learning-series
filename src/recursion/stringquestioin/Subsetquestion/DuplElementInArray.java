package recursion.stringquestioin.Subsetquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplElementInArray {

    static List<List<Integer>> SubsetWithDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerlst = new ArrayList<>();
        outerlst.add(new ArrayList<>());

        int s =0,e=0;
        for(int i=s;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i] == arr[i-1]){
                s = e +1;
            }
            e = outerlst.size()-1;
            int size = outerlst.size();
            for(int j=s;j<size;j++){
                List<Integer> innerlst = new ArrayList<>(outerlst.get(j));
                innerlst.add(arr[i]);
                outerlst.add(innerlst);

            }
        }
        return outerlst;
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
    int[] arr={1,3,2,2};
       List<List<Integer>> ans = SubsetWithDuplicate(arr);
       for(List<Integer> list : ans) {
           System.out.println(list);
       }
//       List<List<Integer>>  asns = subSetWithDuplicates(arr);
//       for (List<Integer> list : asns){
//           System.out.println(list);
//       }
    }
}
