package StringExample;

public class ReverseTheString {
//    static String reverseString(String s) {

//        Time Complexity: O(n) for backward traversal
//        Auxiliary Space: O(n) for storing the reversed string.

//        StringBuilder res = new StringBuilder();

//        for (int i = s.length() - 1; i >= 0; i--) {
//            res.append(s.charAt(i));
//        }
//        return res.toString();
//    }

    static String rev(String s ){
        StringBuffer str = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }

//    static String revString(String s){
//        int l =0; int  rig = s.length()-1;
//        StringBuilder newS = new StringBuilder(s);
//        while (l < rig){
//             char temp = newS.charAt(l);
//             newS.setCharAt(l, newS.charAt(rig));
//             newS.setCharAt(rig, temp);
//             l++;
//             rig--;
//        }
//        return newS.toString();
//    }


    static String revString(String s  ){
        int left=0, right=s.length()-1;
        StringBuffer res = new StringBuffer(s);
        while (left < right){
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right,temp);
            left++;
            right--;

        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "Vaibhav Khot";
//        String res = reverseString(s);
        String str = revString(s);
        String st = rev(s);
        System.out.println(st);
        System.out.println(str);
//        System.out.print(res);
    }
}
