package recursion.arrayProblem;

import java.util.ArrayList;

public class ReturnListPassingNioAgrument {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,6,};
        int target = 5;
        System.out.println(findAllIndexs(arr,target,0));
    }

    static ArrayList<Integer> findAllIndexs(int[] arr, int target, int ind) {
        ArrayList<Integer> list = new ArrayList<>();
        if (ind == arr.length) {
            return list;
        }
        if (arr[ind] == target) {
            list.add(ind);
        }
        ArrayList<Integer> ansFromBelow = findAllIndexs(arr, target, ind + 1);

      list.addAll(ansFromBelow);
        return list;
    }
}
