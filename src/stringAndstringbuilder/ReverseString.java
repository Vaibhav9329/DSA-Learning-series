package stringAndstringbuilder;

public class ReverseString {
    public static void main(String[] args){
        String str = "Java programming ";
        String rev = new  StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
}
