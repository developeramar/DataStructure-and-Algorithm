package Array_Problems;

/*

    Question -- Best Time to Buy and Sell Stock..
 * 
 * 
 * Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible for buying and selling the stocks on different days using transactions where at most one transaction is allowed.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 1, 5, 3, 6, 4}
Output: 5
Explanation:
The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, the highest price of the stock is witnessed on the 5th day, i.e. price = 6. 
Therefore, maximum possible profit = 6 – 1 = 5. 

Input: prices[] = {7, 6, 4, 3, 1} 
Output: 0
Explanation: Since the array is in decreasing order, no possible way exists to solve the problem.


 */

public class buySellStock {

    static int Sell(int price[]  , int len){

        int buy = price[0];
        int max_profit = 0;

        for(int i=0; i<len-1 ; i++){

            if(buy > price[i]){

                buy = price[i];
            }

            else if(price[i] - buy > max_profit){
                max_profit = price[i] - buy;
            }

        }

        return max_profit;


    }    

    public static void main(String[] args) {
        
        int arr[] = {7, 1, 5, 6, 4};
        int len = arr.length;
        int res = Sell(arr, len);
        System.out.println(res);
    }
}
