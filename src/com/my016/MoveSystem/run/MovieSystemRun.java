package com.my016.MoveSystem.run;

import com.my016.MoveSystem.bean.Business;
import com.my016.MoveSystem.bean.Customer;
import com.my016.MoveSystem.bean.Movie;
import com.my016.MoveSystem.bean.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//import static sun.security.jg's.GSSUtil.login;

public class MovieSystemRun {
    public static final Scanner SYS_SC = new Scanner(System.in);
    //定义系统容器
    public static final  List<User> ALL_USERS = new ArrayList<>();
        /*
        *

        *
        * */
    public static Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();
    //TestData

    //定义日期
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //定义当前登陆用户
    public static User loginUser;

    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("吴彦祖");
        c.setMoney(1145);
        c.setPhone("63456457");
        c.setSex('男');
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("谢霆锋");
        c1.setMoney(1919);
        c1.setPhone("6345776457");
        c1.setSex('男');
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("bzg888");
        b.setPassWord("123456");
        b.setUserName("抱住共");
        b.setMoney(0);
        b.setPhone("63776457");
        b.setSex('男');
        b.setAddress("翻斗大街114514号");
        b.setShopName("公益团体");
        ALL_USERS.add(b);
        List<Movie> movies1 = new ArrayList<>();
        ALL_MOVIES.put(b,movies1);

        Business b2 = new Business();
        b2.setLoginName ( "baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        //注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b2,movies);




    }
    public static void main(String[] args) {
        showMain();



    }
    public static void showMain(){
        while (true) {
        System.out.println("================首页=================");
        System.out.println("1.登陆");
        System.out.println("2.用户注册");
        System.out.println("3.商家注册");

            System.out.print("请输入命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1" : login();
            }


        }
    }

    private static void login() {
        while (true) {
            System.out.print("请输入登陆名：");
            String loginName = SYS_SC.nextLine();
            System.out.print("请输入密码");
            String passWord = SYS_SC.nextLine();

            //根据登陆名称查询用户对象
            User u = getUserByLoginName(loginName);
            //判断是否存在
            if ( u!=null ){
            if (u.getPassWord().equals(passWord)){
                //登陆成功
                loginUser=u;
                //判断用户还是商家
                if (u instanceof Customer){
                    //普通客户
                    showCustomerMain();
                }else {
                    //商家
                    showBusinessMain();
                }
                return;
            }
            }else {
                System.out.println("用户名或密码错误！QAQ");
            }
        }
    }
    //商家操作界面
    private static void showBusinessMain() {
        System.out.println("============商家界面============");
        System.out.println(loginUser.getUserName() +(loginUser.getSex()=='男'? "先生" : "女士")+"欢迎进入系统");
        System.out.println( "1、展示详情:");
        System.out.println("2、上架电影:");
        System.out.println("3、下架电影:");
        System.out.println("4、修改电影:");
        System.out.println("5、退出:");
        System.out.print("请输入您要操作的命令:");
        String command = SYS_SC.nextLine();
        switch (command){
            case "1" : showBusinessInfos(); break;
            case "2" : addMovies();
        }
    }

    private static void addMovies() {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        System.out.println("请您输入新片名:");
        String name= SYS_SC.nextLine();
        System.out.println("请您输入主演: ");
        String actor= SYS_SC.nextLine() ;
        System.out.println("请您输入时长:");
        String time= SYS_SC.nextLine();
        System.out.println("请您输入票价: ");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数: ");
        String totalNumber = SYS_SC.nextLine(); // 200\n
        System.out.println("请您输入影片放映时间: ");
        String stime= SYS_SC.nextLine();
        try {
            Movie movie = new Movie(name,actor,Double.valueOf(price),Integer.valueOf(totalNumber),Double.valueOf(time)
            ,simpleDateFormat.parse(stime)
            );
            movies.add(movie);
            System.out.println("成功上架《"+movie.getName()+"》");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void showBusinessInfos() {
        Business business = (Business) loginUser;
        List<Movie> movies =  ALL_MOVIES.get(business);
        if (movies.size()>0) {
            System.out.println(business.getShopName() + "\t\t 电话:"+business.getPhone()+"\t\t 地址："+business.getAddress());
            System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName()+"\t\t"+movie.getActor()+"\t\t"+movie.getAllTime()+"\t\t"+movie.getScore()
                +"\t\t"+movie.getPrice()+"\t\t"+movie.getNumber()+"\t\t"+simpleDateFormat.format(movie.getStartTime()));

            }
        }else {
            System.out.println("店铺内无影片QAQ");
        }


    }

    //客户操作界面
    private static void showCustomerMain() {
        System.out.println("============普通消费者界面============");
        System.out.println(loginUser.getUserName() +(loginUser.getSex()=='男'? "先生" : "女士")+"欢迎进入系统");
        System.out.println("请您选择要操作的功能:");
        System.out.println( "1、展示全部影片信息功能:");
        System.out.println("2、根据电影名称查询电影信息:");
        System.out.println("3、评分功能:");
        System.out.println("4、购票功能:");
        System.out.println("5、退出系统: ");



    }

    public static User getUserByLoginName(String loginName){
        for (User user : ALL_USERS) {
            //判断用户名是否是想要的
            if (user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;
    }
}
