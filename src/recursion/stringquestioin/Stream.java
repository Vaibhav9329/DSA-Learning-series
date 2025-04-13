package recursion.stringquestioin;

public class Stream {
    public static void main(String[] args) {
        skip("","baccad");
        System.out.println(skipString("baccaccadahach"));
        System.out.println(skipWord("vapplecaddeappleachd"));
        System.out.println(skipSomeWord("vapplecappddeappleappchdapp"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skipString(String up ){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipString(up.substring(1));
        }else {
            return ch+skipString(up.substring(1));
        }
    }

    static String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }else{
            return up.charAt(0)+skipWord(up.substring(1));
        }
    }

    static String skipSomeWord(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipSomeWord(up.substring(3));
        }else{
            return up.charAt(0)+skipSomeWord(up.substring(1));
        }
    }
}
