package com.my016.hello;

import java.util.Scanner;

public class ShoppingCar {
    public static void main(String[] args) {
        Commodity[] shopCar = new Commodity[114];
        for (int i = 0; i < shopCar.length; i++) {
            shopCar[i]=new Commodity();
        }
        Commodity[] shopMark = creatQuery();
        //搭建操作
        while (true) {
            System.out.println("请您选择以下操作：");
            System.out.println("1.添加商品");
            System.out.println("2.查看购物车");
            System.out.println("3.修改购物车");
            System.out.println("4.查看商品");
            System.out.println("5.结算");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1 -> add(shopCar, shopMark);
                case 2 -> printShopCar(shopCar);
                case 3 -> changeShopCar(shopCar);
                case 4 -> query(shopMark);
                case 5 -> resultOP(shopCar);
            }
        if (n==5){
            break;
        }

        }

    }

    public static void add (Commodity[] shopCar,Commodity[] shopMark){
        int tempID,j,k;
        int count = reallyLen(shopCar);
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入需要购买商品的ID：");
        while(true) {
            tempID = sc.nextInt();
            //寻找购物车是否有此物品
            for (k = 0; k < shopCar.length; k++) {
                if (tempID == shopCar[k].ID) {
                    System.out.println("请输入购买数量：");
                    tempID = sc.nextInt();
                    shopCar[k].buyNumber += tempID;
                    System.out.println("加入购物车成功，输入“0”继续添加，输入数字其他结束添加");
                    tempID = sc.nextInt();
                    if (tempID == 0) {
                        System.out.println("请输入需要购买商品的ID：");
                    } else {
                        System.out.println("-----------------------------------------------");
                        return;
                    }
                    break;
                }
            }
            if (k == shopCar.length)  {
                for (j = 0; j < shopMark.length; j++) {
                    if (tempID == shopMark[j].ID) {
                        shopCar[count].prince = shopMark[j].prince;
                        shopCar[count].name = shopMark[j].name;
                        shopCar[count].ID = shopMark[j].ID;
                        break;
                    }
                }
                if (j == shopMark.length) {
                    System.out.println("没找到商品，请重新输入ID：");
                    continue;
                } else {
                    //判断购物车是否有此物品

                    System.out.println("请输入购买数量：");
                    tempID = sc.nextInt();
                    shopCar[count].buyNumber = tempID;
                    count++;
                }
                System.out.println("加入购物车成功，输入“0”继续添加，输入数字其他结束添加");
                tempID = sc.nextInt();
                if (tempID == 0) {
                    System.out.println("请输入需要购买商品的ID：");
                } else {
                    System.out.println("-----------------------------------------------");
                    return;
                }

            }


        }
    }

    public static Commodity[] creatQuery(){
        Commodity[] shop =new Commodity[11];
        for (int i = 0; i < shop.length; i++) {
            shop[i]=new Commodity();
        }
        shop[1].name="红牛";      shop[1].prince=6.0; shop[1].ID=114;
        shop[2].name="农夫山泉";    shop[2].prince=2.0; shop[2].ID=514;
        shop[3].name="辣条";  shop[3].prince=0.5; shop[3].ID=191;
        shop[4].name="苹果13ProMax";  shop[4].prince=12999.0; shop[4].ID=98;
        shop[5].name="三星980pro 2t"; shop[5].prince=2599.8; shop[5].ID=10;
        shop[6].name="RTX 3090"; shop[6].prince=11999.00; shop[6].ID=11;
        shop[7].name="I9 12900K"; shop[7].prince=3299.0; shop[7].ID=19;
        shop[8].name="管道疏通剂"; shop[8].prince=9.8; shop[8].ID=199;
        shop[9].name="HDMI高清显示器"; shop[9].prince=1509.7; shop[9].ID=188;
        shop[10].name="卡式炉"; shop[10].prince=37; shop[10].ID=166;

        VeryEasySortForCommodityArrayOfID(shop);
        return shop;
    }

    public static void query (Commodity[] shop){
        System.out.println("-----------------------------------------------");
        System.out.println("商店所有商品：");
        System.out.printf("%5s %15s %15s\n","ID","名称","价格");
        for (int i = 1; i < shop.length; i++) {
            System.out.printf("%5d %15s %15.2f\n",shop[i].ID,shop[i].name,shop[i].prince);
        }
        System.out.println("-----------------------------------------------");
    }

    public static void printShopCar (Commodity[] shop){
        System.out.println("-----------------------------------------------");
        System.out.println("购物车所有商品：");
        System.out.printf("%5s %15s %15s %15s %15s\n","ID","名称","单价","数量","总价");
        for (int i = 0; i<shop.length  ; i++) {
            if (shop[i].name==null){
                continue;
            }
            System.out.printf("%5d %15s %15.2f %15d %15.2f\n",shop[i].ID,shop[i].name,shop[i].prince,shop[i].buyNumber,shop[i].prince*shop[i].buyNumber);
        }
        System.out.println("-----------------------------------------------");
    }

    public static void changeShopCar (Commodity[] shop){
        printShopCar(shop);
        System.out.println("请输入需要修改的商品ID");
        Scanner sc = new Scanner(System.in);
        int opNumber,i;
        while (true) {
            opNumber=sc.nextInt();
            for (i = 0; i <shop.length ; i++) {

                if (shop[i].ID == opNumber){
                    System.out.printf("%5s %15s %15s %15s %15s\n","ID","名称","单价","数量","总价");
                    System.out.printf("%5d %15s %15.2f %15d %15.2f\n",shop[i].ID,shop[i].name,shop[i].prince,shop[i].buyNumber,shop[i].prince*shop[i].buyNumber);
                    System.out.println("已找到该商品，输入“1”删除该商品，输入“Q”修改数量");
                    String s=sc.next();
                    char ch=s.charAt(0);
                if (ch=='1'){
                    shop[i].name=null;
                }
                if (ch=='Q' || ch=='q'){
                    System.out.println("请输入新的数量");
                    opNumber= sc.nextInt();
                    shop[i].buyNumber=opNumber;
                    System.out.println("修改成功！");
                }
                    break;
                }
            }

            System.out.println("如果需要继续修改，请输入“1”，否则结束修改");
            opNumber=sc.nextInt();
            if (opNumber!=1) {
                System.out.println("-----------------------------------------------");
                return;
            }
            else{
                printShopCar(shop);
                System.out.println("请输入需要修改的商品ID");
            }
        }

    }

    public static int reallyLen (Commodity[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (  (arr[i].name == null) &&  ( arr[i].ID==0 )  ) {
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static void resultOP (Commodity[] shop){
        printShopCar(shop);
        double sum=0;
        for (int i = 0; i < shop.length; i++) {
            sum+=shop[i].prince*shop[i].buyNumber;
        }
        System.out.println("合计："+sum);

    }

    public static void VeryEasySortForCommodityArrayOfID (Commodity[] array){
        Commodity[] temp=new Commodity[2];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=new Commodity();
        }
        for (int i = 1; i < array.length; i++) {
            for (int i1 = 1; i1 < array.length-i; i1++) {
                if (array[i1].ID > array[i1+1].ID){
                    temp=changSpecialArrayForCommodityArray(array[i1],array[i1+1]);
                    array[i1]=temp[0];
                    array[i1+1]=temp[1];

                }
            }
        }

    }

    public static Commodity[] changSpecialArrayForCommodityArray (Commodity arrayA ,Commodity arrayB ){
        Commodity[] temp=new Commodity[2];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=new Commodity();
        }
        temp[0]=arrayB;
        temp[1]=arrayA;
        return temp;
    }



}


