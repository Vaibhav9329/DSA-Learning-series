package StringExample;

public class CountNofVowelsConsonantsWhitespace {
    public static void main(String[] args) {
        String s = "Take u forward is Awesome";

        contVCWspace(s);
    }

    static void contVCWspace(String str) {
        int len = str.length();
        int vowels = 0, consonants = 0, whitespaces = 0;
        str = str.toLowerCase(); // converting given string to lowercase
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
            else if (ch == ' ')
                whitespaces++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + whitespaces);
    }
}