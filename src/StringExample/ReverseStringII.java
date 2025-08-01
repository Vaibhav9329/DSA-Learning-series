package StringExample;

public class ReverseStringII {
    public static String reverseStr(String s, int k){
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i+=2*k){
            int start =i;
            int end = Math.min(i+k-1,arr.length-1);
            revStr(arr,start,end);
        }
        return new String(arr);
    }

    public static void revStr(char[] arr, int left,int right){
         while(left < right){
             char temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             left++;
             right--;
         }
    }

    public static void main(String[] args) {
        String s ="abcdefg";
        int k =2;

        System.out.println(s);
            System.out.println(reverseStr(s,k));
    }
}
