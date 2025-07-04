//Richest Customer Wealth


//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//Example 1:
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
//Example 2:
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
//Explanation:
//        1st customer has wealth = 6
//2nd customer has wealth = 10
//3rd customer has wealth = 8
//The 2nd customer is the richest with a wealth of 10.
//Example 3:
//Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
//Output: 17
package array;

import java.util.Arrays;

public class RichestCostumerwealth {
    public int wealth(int[][] account){
            int num = Integer.MIN_VALUE;
            for(int[] x : account){

                int sum=0;
                for(int z :x){
                    sum+=z;
                }

                if(sum>num){
                    num = sum;
                }
            }
            return num;
    }

    public static void main(String[] args) {
        RichestCostumerwealth rich=new RichestCostumerwealth();
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(Arrays.toString(new int[]{rich.wealth(accounts)}));
    }
}
