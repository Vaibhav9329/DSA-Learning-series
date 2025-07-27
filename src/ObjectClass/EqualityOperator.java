package ObjectClass;

public class EqualityOperator {
    public static void main(String[] args) {
    String name = "Rahul";
    int code = name.hashCode();
        System.out.println(code);

        Integer a = 53434892;
        int code1 = a.hashCode();

        System.out.println(code1);

        Long b = 122323224L;
        long code2 = b.hashCode();
        System.out.println(code2);
    }



}
