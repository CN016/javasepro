package com.my016.innerclass;

public class TestDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal(){
            //并不是动物对象，抽象类不能创建对象，创建
            //的是匿名内部类对象
            @Override
            public void run() {
                System.out.println("🐅老虎跑~~~");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("🐅老虎跑~~~");
//    }
//}

abstract class Animal{

    public abstract void run();


}
