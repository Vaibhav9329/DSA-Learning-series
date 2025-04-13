package recursion.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3};
        System.out.println(removeDuplicates(arr) );
    }
    static List<List<Integer>> removeDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outerList.size()-1;
            int n = outerList.size();

            for(int j =start;j<n;j++){
                List<Integer> list = new ArrayList<>(outerList.get(j));
                list.add(arr[i]);
                outerList.add(list);
            }
        }
        return outerList;
    }
}
