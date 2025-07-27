package stringAndstringbuilder;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str == " "){
            return false;
        }

        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char left = str.charAt(i);
            char right = str.charAt(str.length()-1-i);

            if(left != right){
                return false;
            }
        }
        return true;
    }
}
