package StringExample;

public class StringPalindromeOrNot
{
    static boolean stringPali(String s){
        int left = 0, right=s.length()-1;
        while (left < right){
            char l = s.charAt(left), r=s.charAt(right)  ;
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="ABCDECBA";
        boolean ans = stringPali(s);
        if(ans == true){
            System.out.println("is pal");
        }
        else {
            System.out.println(" is not pal");
        }
    }
}
