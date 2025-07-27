package ObjectClass;

public class StringCharacter {
    public static void main(String[] args) {
        String s = "java is Vast Programming languages";

        StringBuffer s1=new StringBuffer();

        s1 = s1.append(s);
        System.out.println(s1);
    }
}