package stringAndstringbuilder;

public class SimpleClass {

    public static void main(String[] args) {
        String a = "vaibhav";
          a = "khot";
         String c=a;

         String name1 = new String("vaibhav");
         String name2 = new String("vaibhav");

        System.out.println(a);
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);
    }
}
