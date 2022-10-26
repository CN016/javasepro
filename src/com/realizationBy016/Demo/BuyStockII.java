package com.realizationBy016.Demo;

import java.util.ArrayList;
import java.util.List;

public class BuyStockII {
    public static void main(String[] args) {
    int[] data1 = {7,1,5,3,6,4};
    int[] data2 = {1,2,3,4,5};
    int[] data3 = {7,6,4,3,1};
        System.out.println(new BuyStockIISolution().maxProfit(data1));
        System.out.println(new BuyStockIISolution().maxProfit(data2));
        System.out.println(new BuyStockIISolution().maxProfit(data3));
    }
}
class BuyStockIISolution {
    public int maxProfit(int[] prices) {
        List<Integer> integerList = new ArrayList<>();
    for (int i = prices.length -2; i >=0 ; i--){
        integerList.add(prices[i+1]-prices[i]);
    }
    int sum = 0 ;
        for (Integer integer : integerList) {
            if (integer > 0) {
                sum += integer;
            }
        }
    return sum;
    }
}
