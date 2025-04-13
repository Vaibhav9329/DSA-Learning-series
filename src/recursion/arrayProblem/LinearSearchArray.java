package recursion.arrayProblem;

import java.util.ArrayList;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr={2,34,5,35,3,3,3,3,3,3,6,21,3};
        int target = 3;

        System.out.println(findindexstart(arr,target, 0));
        System.out.println(findindexLast(arr,target,arr.length-1));
//        allindexs(arr,target,0);
//        System.out.println(indlist);
        System.out.println(FindallIndex(arr , 3, 0,new ArrayList<>()));
    }
    //FindIndex from first
    static int findindexstart(int[] arr, int target, int ind){
        if(ind == arr.length){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        else{
            return findindexstart(arr,target,ind+ 1);
        }
    }

    //FindIndex from Last
    static int findindexLast(int[] arr, int target, int ind){
        if(ind == -1){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        else{
            return findindexLast(arr,target,ind- 1);
        }
    }

    //Add all indexs of element == target
//    static ArrayList<Integer> indlist = new ArrayList<>();
//    static void allindexs(int[] arr, int target, int ind){
//        if(ind == arr.length){
//            return ;
//        }
//        if(arr[ind]==target){
//            indlist.add(ind);
//        }
//        allindexs(arr,target,ind+1);
//    }
    static ArrayList<Integer> FindallIndex(int[] arr, int target,int ind, ArrayList<Integer> list){
        if(ind == arr.length){
            return  list;
        }
        if(arr[ind] == target){
            list.add(ind);
        }
        return FindallIndex(arr,target,ind+1,list);
    }
}
