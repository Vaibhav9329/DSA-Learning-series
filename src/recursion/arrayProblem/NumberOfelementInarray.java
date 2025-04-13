package recursion.arrayProblem;

import java.util.ArrayList;

public class NumberOfelementInarray {
    public static ArrayList<Integer> findOccuranceOfEle(int[] arr,int start, int tar,ArrayList<Integer> list){
        if(start == arr.length){
            return list;
        }
        if(arr[start] == tar){
            list.add(start);
        }
        return findOccuranceOfEle(arr,start+1,tar,list);
    }


    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,2,2,2,3,4,5,6,7,2,8};
        ArrayList<Integer> list = new ArrayList<>();
    //    System.out.println(findOccuranceOfEle(arr,0,2,new ArrayList<>()));
        System.out.println(findOccuranceOfEle(arr,0,2,list));
    }

}