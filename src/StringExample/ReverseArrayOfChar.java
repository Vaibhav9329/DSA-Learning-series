package StringExample;

import java.util.Arrays;

public class ReverseArrayOfChar {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseCharString(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverseCharString(char[] s){
        int left =0, right=s.length-1;
        while (left < right){
            char temp = s[left];
            s[left]  = s[right];
            s[right]  = temp;
            left++;
            right--;
        }
    }
}
