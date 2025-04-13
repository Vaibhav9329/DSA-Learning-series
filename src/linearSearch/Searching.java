package linearSearch;

  //linearSearch example

public class Searching {
    public static int linearSearching(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

        public static void main(String []  args){
            int [] arr={10,20,30,40};
            System.out.println(linearSearching(arr,30));
            System.out.println(linearSearching(arr,60));
    }
}
