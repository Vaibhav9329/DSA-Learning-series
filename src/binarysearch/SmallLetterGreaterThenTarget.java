package binarysearch;

 // Same as ceiling of Number

public class SmallLetterGreaterThenTarget {
    static char smalLetterGreaterThenTarget(char[] letter, char target){
        int start = 0;
        int end = letter.length-1;
        while (start <= end){
            int mid =  ((start + end)/2);

             if(target > letter[mid]){
                start =  (mid+1);
            }else{
                end =  (mid-1);
            }
        }
        return letter[start];
    }

    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'h';
        System.out.println(smalLetterGreaterThenTarget(letter,target));
    }
}
