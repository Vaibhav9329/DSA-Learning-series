package array;

public class BestTimeToBuySellStock {
    public static int buYseLLStock(int[] sPrice){
        int maxP = 0;
        int minF = sPrice[0];

        for(int i=0;i<sPrice.length;i++){
            minF = Math.min(minF,sPrice[i]);
            int profit = sPrice[i] - minF;
            maxP = Math.max(maxP,profit);
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] stockPrice = {7,1,5,3,6,4};
        System.out.println(buYseLLStock(stockPrice));
    }
}
