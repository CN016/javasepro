package com.my016.stream_Apply;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
* 需求:某个公司的开发部门，分为开发一部和二部，现在需要进行年中数据结算。
分析:员工信息至少包含了(名称、性别、工资、奖金、处罚记录)︰
开发一部有4个员工、开发二部有5名员工
分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Topperformer
分别统计出2个部门的平均月收入，要求去掉最高和最低工资。
统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。

* */
public class Demo {
    public static double allMoney = 0;
    public static void main(String[] args) {
        List<Employee> partOne = new ArrayList<>();
        partOne.add(new Employee("016",'男',16888,null));
        partOne.add(new Employee("006",'男',1888,"迟到2次"));
        partOne.add(new Employee("017",'女',6888,null));
        partOne.add(new Employee("056",'男',13888,"顶撞上司"));

        List<Employee> partTwo = new ArrayList<>();
        partTwo.add(new Employee("牛子",'男',4567,null));
        partTwo.add(new Employee("要子",'男',3567,null));
        partTwo.add(new Employee("啥子",'男',4557,"调戏女同事"));
        partTwo.add(new Employee("傻子",'女',4667,null));
        partTwo.add(new Employee("克子",'女',12367,null));

        //开发一部的最高工资员工信息
       // System.out.println(partOne.stream().max((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus())).get());

        Topperformer  best1 =  partOne.stream().max((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus()))
                .map(employee -> new Topperformer(employee.getName(), employee.getBonus())).get();
        Topperformer  best2 =  partTwo.stream().max((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus()))
                .map(employee -> new Topperformer(employee.getName(), employee.getBonus())).get();
        System.out.println("开发一部最佳员工是：" +best1);
        System.out.println("开发二部最佳员工是：" +best2);

        //统计平均工资
       // double allMoney = 0;
        partOne.stream().sorted((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus()))
                .skip(1).limit(partOne.size() - 2).forEach(employee -> {
                    //求总和
            allMoney+= employee.getBonus();
                });
        System.out.println("开发一部的平均工资是："+allMoney/(partOne.size()-2));


        allMoney=0;


        partTwo.stream().sorted((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus()))
                .skip(1).limit(partTwo.size() - 2).forEach(employee -> {
                    //求总和
                    allMoney+= employee.getBonus();
                });
        System.out.println("开发二部的平均工资是："+allMoney/(partTwo.size()-2));


        allMoney=0;


        Stream<Employee> stream = Stream.concat( partOne.stream(),partTwo.stream() );
        stream.sorted((e1, e2) -> Double.compare(e1.getBonus(), e2.getBonus()))
                .skip(1).limit(partTwo.size()+partOne.size() - 2).forEach(employee -> {
                    //求总和
                    allMoney+= employee.getBonus();
                });
       // System.out.println("开发部的平均工资是："+allMoney/(partTwo.size()+partOne.size()-2)); //有精度问题 结果7214.428571428572
        //封装大数据对象解决精度问题
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(partTwo.size()+partOne.size()-2);
        System.out.println("开发部的平均工资是："+a.divide(b,2, RoundingMode.HALF_UP));
    }
}
