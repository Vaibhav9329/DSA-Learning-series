package stringAndstringbuilder;

public class ToString {

    int id;
    String  name;
    String address;

    public ToString(int id,String name, String address ){
        super();
        this.id  = id;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return id+" "+name+" "+address;
    }
    public static void main(String[] args) {
        ToString d = new ToString(11,"Vaibhav", "pune");
        System.out.println(d);
        System.out.println(d.toString());
    }


}
