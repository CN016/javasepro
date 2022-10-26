package com.my016.advanced;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Aggregate_Demo4_ForUsually_API_Deeper_Application {
    public static void main(String[] args) {
        System.out.println("学生成绩处理系统");
        System.out.println("请输入所有学生成绩，系统会自动剔除低于80分的成绩");
        System.out.println("开始录入（以空格隔开，出现负数成绩截止）：");
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> score =new ArrayList<>();
        //数据录入循环
        while (true){
            int temp =sc.nextInt();
            if (temp >=0) {
                score.add(temp);
            }
            else {
                System.out.println("数据录入成功！");
                break;
            }

        }
        //从后面索引！
        for (int i = score.size()-1; i >=0 ; i--) {
            int anotherTemp=score.get(i);
            if (anotherTemp < 80){
                anotherTemp=score.remove(i);
            }
        }
        System.out.println("Finally_Result:"+score);
    }
}
