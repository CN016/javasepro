package com.realizationBy016.Demo;

public class ContainerWithTheMostWater {

    public static void main(String[] args) {

        int[] data1 = {1,8,6,2,5,4,8,3,7};
        int[] data2 = {1,1};
        System.out.println(new ContainerWithTheMostWaterSolution().maxArea(data1));
        System.out.println(new ContainerWithTheMostWaterSolution().maxArea(data2));
        //System.out.println(new ContainerWithTheMostWaterSolution().maxArea());
    }
}
class ContainerWithTheMostWaterSolution {
    public int maxArea(int[] height) {
//    int max=0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = 0; j < height.length ; j++) {
//                if ( j == i ){
//                    continue;
//                }
//                if ( height[i]>=height[j]  ){
//                    //计算容量
//                    int temp = height[j]*Math.abs(i-j);
//                    if (temp>max){
//                        max=temp;
//                    }
//                }
//            }
//        }
//        return max;
        //暴力求解
        int i=0;int j=height.length-1;
        int tall,len;
        int area=0;
        while(i<j){
            len= j-i;
            tall=height[i]<height[j]?height[i++]:height[j--];//固定一端，高度更小的那条边，向中间尝试
            if(len*tall>area){
                area=len*tall;
            }
        }
        return area;

    }
}
