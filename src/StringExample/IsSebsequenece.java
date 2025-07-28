package StringExample;

public class IsSebsequenece {
        public static boolean isSqunce(String s, String t){
            int i=0;
            int j=0;

            while (i<s.length() && j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                }
                j++;
            }
            return i == s.length();
        }

    public static void main(String[] args) {
        String s ="axc";
        String t="ahbgdc";

        System.out.println(isSqunce(s,t));
    }
}
