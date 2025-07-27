package StringExample;

public class StringPalindromeOrNot
{
   static boolean stringPali(String s){
       if(s == null && s.length() == 0 ){
           return true;
       }
       s = s.toLowerCase();
       for(int i=0;i<s.length();i++){
           int strt = s.charAt(i);
           int end = s.charAt(s.length()-1-i);

           if(strt != end){
               return false;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        String s ="absgdba";
//        System.out.println('A'+0);
        boolean ans = stringPali(s);
        if(ans == true){
            System.out.println("is pal");
        }
        else {
            System.out.println(" is not pal");
        }
    }
}
