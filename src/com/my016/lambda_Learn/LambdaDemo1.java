package com.my016.lambda_Learn;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //学会使用lambda的标准格式简化匿名内部类的代码格式 只能简化接口中只有
//        一个抽象方法的匿名内部类形式
     Animal animal = new Animal() {
         @Override
         public void run() {
             System.out.println("🐢跑了~");
         }
     };
     animal.run();

     Swimming swimming = new Swimming() {
         @Override
         public void swim() {
             System.out.println("开始游泳🌶");
         }
     };
     go(swimming);

     //////////////////////////////////////////
        Swimming swimming1 = () ->{
            System.out.println("不想游泳");
        };
        go(swimming1);

    }


    public static void go(Swimming swimming){
        System.out.println("开始~~~~~");
        swimming.swim();
        System.out.println("结束~~~~~");
    }
}
@FunctionalInterface
interface Swimming{
    void swim();
}


abstract class Animal{
    public abstract void run();
}
