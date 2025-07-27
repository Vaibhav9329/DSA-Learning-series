package genLambdaExceptionObject;

import java.util.ArrayList;

public class CustomArraylist {

    private  int[] data;
    private static int DEFAULT_SIZE = 10;
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("string");
        list.add("Vaibhav");
        list.add("shreyesh");
        list.add(25829529);

        ArrayList<String> list1= new ArrayList<>();
        list1.add("adsjlgjs");
        list1.add("12345");
        list1.add("445511");

        System.out.println(list);
        System.out.println(list1);
    }
}
