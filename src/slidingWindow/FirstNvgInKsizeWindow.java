package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNvgInKsizeWindow {
  public static int firstNegNo(int[] arr , int k){
      int i=0,j=0;
      List<Integer> list = new ArrayList<>();
      int n = arr.length;
      while (j<n){
          if(arr[i] < 0){
              list.add(arr[i]);
          }
          if(j-i+1 < k){
              j++;
          } else if (j-i+1 == k) {
                if(list.size() == 0){
                    return 0;
                }else {
                    i++;
                    j++;
                }
          }
      }
      return list.getFirst();
  }

    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-16,30,13,28};
        int k=3;
        System.out.println(firstNegNo(arr,k));
    }

}
