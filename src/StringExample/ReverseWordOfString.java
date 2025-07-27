package StringExample;

public class ReverseWordOfString {
    static String reVordOfString(String s){
        String[] arr = s.trim().split("\\s+");
        int i=0;
        int j=arr.length-1;
        while (i<j){
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return String.join(" ",arr);
    }

    public static void main(String[] args) {
        String str = "ipl won by RCB team";
        String s = reVordOfString(str);
        System.out.println(s);
    }
}
