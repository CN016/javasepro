package com.realizationBy016.Demo;

public class TrappingRainWater {
    public static void main(String[] args) {
    int[] data1 = {0,1,0,2,1,0,1,3,2,1,2,1};
    int[] data2 = {4,2,0,3,2,5};
        System.out.println(new TrappingRainWaterSolution().trap(data1));
        System.out.println(new TrappingRainWaterSolution().trap(data2));
    }
}
class TrappingRainWaterSolution {
    public int trap(int[] height) {
        int sum = 0;
        if ( height.length == 1 || height.length == 2 ){
            return 0;
        }
        int index = 0;
        while (height[index] == 0 ){
            index++;
        }
        int p = index+1;
        while (true){
            if (height[p]>=height[index] && p > index){
                //计算容量
                for (int i = index+1 ; i <=p ; i++){
                    sum+= height[index]-height[i];
                }
                index = p;
            }
            p++;

            if ( p >= height.length-1){
                break;
            }
        }
        return sum;
    }
}
