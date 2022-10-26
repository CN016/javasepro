package com.realizationBy016.Demo;

import java.util.Arrays;

public class BuyStock {
    public static void main(String[] args) {
    int[] data1 = {7,1,5,3,6,4};
    int[] data2 = {7,6,4,3,1};
        System.out.println(new BuyStockSolution().maxProfit(data1));
        System.out.println(new BuyStockSolution().maxProfit(data2));
    }
}
class BuyStockSolution {
    public int maxProfit(int[] prices) {
//        int max = 0 ;
//        int index = 0;
//        int end = prices.length-1;
//        int[] temp =  Arrays.copyOf(prices,end+1);
//        Arrays.sort(temp);
//        int min = temp[0] , dataMax = temp[end];
//        //双指针
//        while (index < end ){
//            if ( prices[index] < prices[end] ){
//                max = Math.max(prices[end] - prices[index], max);
//            }else if ( prices[index] > prices[end] ){
//                if ( prices[index+1] < prices[end] ){
//                    max = Math.max(prices[end] - prices[index + 1], max);
//                }
//                if ( prices[index] < prices[end-1] ){
//                    max = Math.max(prices[end - 1] - prices[index], max);
//                }
//            }
//            if (prices[index] == min && prices[end] == dataMax){
//                break;
//            }
//            if ( prices[index] == min ){
//                index--;
//            }
//            if ( prices[end] == dataMax){
//                end++;
//            }
//
//
//
//            index++;end--;
//        }
//
//
//
//        return max;

        int max = 0 ;
        int min = prices[0];
        for (int price : prices) {
            max = Math.max(max , price - min);
            min = Math.min(price,min);
        }
        return max;
    }
}
