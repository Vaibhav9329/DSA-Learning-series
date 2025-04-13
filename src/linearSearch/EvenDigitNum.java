package linearSearch;

public class EvenDigitNum {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits %2 == 0;
    }

    int digits(int num){
        if(num <0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {18,124,22, 9 , 177, 98,1};
        EvenDigitNum ev = new EvenDigitNum();
        System.out.println(ev.findNumbers(nums));
//        System.out.println(new EvenDigitNum (findNumbers(nums)));
    }
}
