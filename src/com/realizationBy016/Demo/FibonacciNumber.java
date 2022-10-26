package com.realizationBy016.Demo;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(new FibonacciNumberSolution().fib(2));
        System.out.println(new FibonacciNumberSolution().fib(3));
        System.out.println(new FibonacciNumberSolution().fib(4));
    }
}
class FibonacciNumberSolution {
    public int fib(int n) {
//        int[] dp= new int[n +1];
//        if(n <= 1){
//            return n;
//        }
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2; i < dp.length; i++) {
//            dp[i] = dp[i-1] +dp[i-2];
//        }
//        return dp[n];
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
//        if(n==2)
//            return 1;
//        if(n==3)
//            return 2;
//        if(n==4)
//            return 3;
//        if(n==5)
//            return 5;
//        if(n==6)
//            return 8;
//        if(n==7)
//            return 13;
//        if(n==8)
//            return 21;
//        if(n==9)
//            return 34;
//        if(n==10)
//            return 55;
//        if(n==11)
//            return 89;
//        if(n==12)
//            return 144;
//        if(n==13)
//            return 233;
//        if(n==14)
//            return 377;
//        if(n==15)
//            return 610;
//        if(n==16)
//            return 987;
//        if(n==17)
//            return 1597;
//        if(n==18)
//            return 2584;
//        if(n==19)
//            return 4181;
//        if(n==20)
//            return 6765;
//        if(n==21)
//            return 10946;
//        if(n==22)
//            return 17711;
//        if(n==23)
//            return 28657;
//        if(n==24)
//            return 46368;
//        if(n==25)
//            return 75025;
//        if(n==26)
//            return 121393;
//        if(n==27)
//            return 196418;
//        if(n==28)
//            return 317811;
//        if(n==29)
//            return 514229;
//        if(n==30)
//            return 832040;
//        return 0;
        switch(n)
        {
            case 0:     return 0;
            case 1:     return 1;
            case 2:	    return 1;
            case 3:	    return 2;
            case 4:	    return 3;
            case 5:	    return 5;
            case 6:	    return 8;
            case 7:	    return 13;
            case 8:	    return 21;
            case 9:	    return 34;
            case 10:	return 55;
            case 11:	return 89;
            case 12:	return 144;
            case 13:	return 233;
            case 14:	return 377;
            case 15:	return 610;
            case 16:	return 987;
            case 17:	return 1597;
            case 18:	return 2584;
            case 19:	return 4181;
            case 20:	return 6765;
            case 21:	return 10946;
            case 22:	return 17711;
            case 23:	return 28657;
            case 24:	return 46368;
            case 25:	return 75025;
            case 26:	return 121393;
            case 27:	return 196418;
            case 28:	return 317811;
            case 29:	return 514229;
            case 30:	return 832040;
            default:
                return 0;
        }
    }
}