package array;

public class WierdType {
    public static void main(String[] args) {
        int n=18;
        if(n%2!=0){
            System.out.println("wierd 1");
        }else if(n%2==0 &&  n>=2 &&  n<5){
            System.out.println("not wierd 1");
        }
        else if(n>=6 && n<10){
            System.out.println("wierd 2");
        }
        else if(n%2==0 && n>20){
            System.out.println("not wierd 2");
        }
        else {
            System.out.println("number is between 11 to 20");
        }
    }
}
