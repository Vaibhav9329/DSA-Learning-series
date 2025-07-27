package array;

public class BestTimeToBuySellStock_II {
    public static int mxProfit(int[] price){
        if(price == null || price.length <= 1){
            // We need prices for 2 days at least to find the profit.
            return 0;
        }
        int tprofit = 0;
        for(int i=1;i<price.length;i++){
            // Checking if we can profit with previous day's price.
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get the total profit.
            if(price[i]> price[i-1]){
                tprofit += price[i] - price[i-1];
            }
        }
        return tprofit;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(mxProfit(price));
    }
}
