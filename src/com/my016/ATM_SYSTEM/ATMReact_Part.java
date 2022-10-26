package com.my016.ATM_SYSTEM;

import com.my016.advanced.TryStringDemo5ForVerificationCode;

import java.util.*;

public class ATMReact_Part {
    public static void main(String[] args) {
        ArrayList<UserAccount> bankCount = new ArrayList<>();
        while (true) {
            System.out.println("---------------------欢迎使用016ATM系统！---------------------");
            //System.out.println("-----------------------------------------------------------");
            System.out.println("请选择操作：");
            System.out.println("1.登陆");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("-----------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n == 1) loginBankOf016_ATMSystem(bankCount);
            if (n == 2) registerBankAccount(bankCount);
            if (n == 3) return;

        }
    }

    public static void registerBankAccount(ArrayList<UserAccount> bank) {
        UserAccount newAccount = new UserAccount();
        System.out.print("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String newName = sc.next();
        Random r = new Random();
        int[] newID = new int[8];
        int ID = 0, count;

        //随机账户生成

        while (true) {
            count = 0;
            for (int i = 0; i < newID.length; i++) {
                newID[i] = r.nextInt(10);
            }
            for (int i = 0; i < newID.length; i++) {
                ID = ID * 10 + newID[i];
            }
            for (int i = 0; i < bank.size(); i++) {
                if (ID == bank.get(i).getIDCard()) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                break;
            }

        }

        String newPassWord;
        while (true) {
            System.out.print("请输入密码：");

            newPassWord = sc.next();

            System.out.print("请二次确认密码:");

            String enterPIN = sc.next();

            if (enterPIN.equals(newPassWord)) {
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入！");
            }
        }

        System.out.println("密码设置成功！");
        System.out.print("请输入单次取款限制金额：");
        double newLim = sc.nextDouble();

        System.out.println("开户成功！，卡号：" + ID);
        newAccount.setPassWord(newPassWord);
        newAccount.setIDCard(ID);
        newAccount.setUserName(newName);
        newAccount.setLimitedNumber(newLim);
        newAccount.setAllMoney(0);

        bank.add(newAccount);


    }

    public static void loginBankOf016_ATMSystem(ArrayList<UserAccount> bank) {
        if (bank.size() == 0) {
            System.out.println("当前系统内还没有账户，请先注册！");

        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入卡号ID：");
            String strID = sc.next();
            //获取用户输入ID；
            //////////////////////////////////////////////////////
            char[] chIDArray = strID.toCharArray();
            int[] intIDArray = new int[chIDArray.length];
            for (int i = 0; i < chIDArray.length; i++) {
                switch (chIDArray[i]) {
                    case '0' -> intIDArray[i] = 0;
                    case '1' -> intIDArray[i] = 1;
                    case '2' -> intIDArray[i] = 2;
                    case '3' -> intIDArray[i] = 3;
                    case '4' -> intIDArray[i] = 4;
                    case '5' -> intIDArray[i] = 5;
                    case '6' -> intIDArray[i] = 6;
                    case '7' -> intIDArray[i] = 7;
                    case '8' -> intIDArray[i] = 8;
                    case '9' -> intIDArray[i] = 9;
                }
            }
            int intID = 0;
            for (int i = 0; i < intIDArray.length; i++) {
                intID = intID * 10 + intIDArray[i];
            }

            //////////////////////////////////////////////////////

            //寻找账户对象;
            UserAccount loginObject = findUser(bank, intID);
            if (loginObject == null) {
                System.out.println("用户ID不存在，请重新登陆！");
                return;
            }

            //输密码


            int errorCount = 0;
            while (true) {
                System.out.print("请输入密码：");
                String inputPIN1 = sc.next();

                if (verificationCode_VerificationSystem()) {
                    //验证码系统
                    if (inputPIN1.equals(loginObject.getPassWord())) {


                        System.out.println("登陆成功！");
                        System.out.println("您好，" + loginObject.getUserName() + "先生/女士！");

                        /////////////////////////////////////////////////////////////
                        //用户界面
                        userReactFor016_ATMSystem(bank, intID);
                        return;
                    } else {
                        System.out.println("密码不正确，请重新输入！");
                        errorCount++;
                        if (errorCount >= 3) {
                            System.out.println("密码连续错误输入三次，自动退出登陆QAQ");
                            return;
                        }
                    }

                } else {
                    System.out.println("验证码错误，请重新输入！");
                }

            }
        }
    }

    public static UserAccount findUser(ArrayList<UserAccount> bank, int beSearchedID) {
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getIDCard() == beSearchedID) {
                return bank.get(i);
            }
        }
        return null;
    }

    public static void userReactFor016_ATMSystem(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            UserAccount personalAccount = findUser(bank, intID);
            System.out.println("---------------------欢迎使用016ATM系统！---------------------");
            //System.out.println("-----------------------------------------------------------");
            System.out.println("请选择操作：");
            System.out.println("1.查询余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.注销账户");
            System.out.println("7.退出");
            System.out.println("-----------------------------------------------------------");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    checkTheBalance(personalAccount);
                    break;
                case 2:
                    deposit(bank, intID);
                    break;
                case 3:
                    withdrawMoney(bank, intID);
                    break;
                case 4:
                    transferAccounts(bank, intID);
                    break;
                case 5:
                    changePassword(bank, intID);
                    return;
                case 6:
                    removeAccount(bank, intID);
                case 7:
                    return;
            }

        }
    }

    public static boolean verificationCode_VerificationSystem() {
        TryStringDemo5ForVerificationCode rs = new TryStringDemo5ForVerificationCode();
        Random r = new Random();
        int n = r.nextInt(6) + 5;
        String creatRandomCode = rs.randomForVerificationCode(n);
        Scanner sc = new Scanner(System.in);
        System.out.printf("验证码:%s\n", creatRandomCode);
        System.out.print("请输入验证码:");
        String inputCode = sc.next();
        if (inputCode.equalsIgnoreCase(creatRandomCode)) {
            return true;
        }
        return false;
    }

    public static void checkTheBalance(UserAccount personalCount) {
        double balance = personalCount.getAllMoney();
        System.out.println("当前账户余额为：" + balance);
    }

    public static void deposit(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getIDCard() == intID) {
                System.out.print("请输入存款金额：");
                double allMoney = bank.get(i).getAllMoney();
                bank.get(i).setAllMoney(allMoney + sc.nextDouble());
                System.out.println("存款成功!");
                UserAccount personalAccount = findUser(bank, intID);
                checkTheBalance(personalAccount);
                return;
            }
        }
    }

    public static void withdrawMoney(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < bank.size(); i++) {
                if (bank.get(i).getIDCard() == intID) {
                    System.out.println("请输入取款金额");
                    double allMoney = bank.get(i).getAllMoney();
                    double withdraw_Money = sc.nextDouble();
                    if (withdraw_Money > allMoney) {
                        //余额不足提示
                        checkTheBalance(findUser(bank, intID));
                        System.out.println("余额不足QAQ");
                        System.out.println("是否继续取款");
                        System.out.println("1.是");
                        System.out.println("2.否");
                        int n = sc.nextInt();
                        if (n == 1) {
                            continue;
                        } else {
                            return;
                        }
                    }
                    if (withdraw_Money > bank.get(i).getLimitedNumber()) {
                        System.out.println("超过单词取款最大金额，请重新输入！");
                        continue;
                    }
                    bank.get(i).setAllMoney(allMoney - withdraw_Money);

                    System.out.println("取款成功!");
                    UserAccount personalAccount = findUser(bank, intID);
                    checkTheBalance(personalAccount);
                    return;

                }
            }
        }
    }

    public static void changePassword(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getIDCard() == intID) {
                String oldPassword = bank.get(i).getPassWord();
                System.out.print("请输入原密码：");
                String inputPassword = sc.next();
                if (inputPassword.equals(oldPassword)) {
                    while (true) {
                        System.out.print("请输入新密码");
                        String newPassword = sc.next();
                        System.out.print("请二次确认密码:");
                        inputPassword = sc.next();
                        //验证码
                        //////////////////////
                        while (true) {
                            if (verificationCode_VerificationSystem()) {
                                break;
                            } else {
                                System.out.println("验证码不正确，请重新输入QAQ");
                            }
                        }
                        //////////////////////
                        if (inputPassword.equals(newPassword)) {
                            bank.get(i).setPassWord(newPassword);
                            System.out.println("新密码设置成功！");
                            return;
                        }
                        System.out.println("两次密码不一致！");
                    }
                }
                System.out.println("原密码不正确QAQ");
                break;
            }
        }
    }

    public static void removeAccount(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).getIDCard() == intID) {
                if (bank.get(i).getAllMoney() > 0) {
                    checkTheBalance(findUser(bank, intID));
                    System.out.println("该账户还有余额，是否继续销户QAQ");
                    System.out.println("1.是");
                    System.out.println("2.否");
                    int n = sc.nextInt();
                    if (n == 2) {
                        return;
                    }
                }
                //验证码
                //////////////////////
                while (true) {
                    if (verificationCode_VerificationSystem()) {
                        break;
                    } else {
                        System.out.println("验证码不正确，请重新输入QAQ");
                    }
                }
                //////////////////////

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!二次确认!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("是否确定销户");
                System.out.println("1.是");
                System.out.println("2.否");
                int n = sc.nextInt();
                if (n == 1) {
                    UserAccount temp = bank.remove(i);
                    System.out.println("销户成功！");
                }
                System.out.println("登陆状态失效QAQ");
                break;
            }
        }
    }

    public static void transferAccounts(ArrayList<UserAccount> bank, int intID) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入需要转入的卡号ID：");
            int targetID = sc.nextInt();
            for (int i = 0; i < bank.size(); i++) {
                if (bank.get(i).getIDCard() == intID){
                    System.out.println("不能给自己转账！ :) ");
                    break;
                }
                if (bank.get(i).getIDCard() == targetID) {
                    while (true) {
                        checkTheBalance(findUser(bank, intID));
                        System.out.println("请输入转账的金额：");
                        double theMoney = sc.nextDouble();
                        if (theMoney > findUser(bank, intID).getAllMoney()) {
                            System.out.println("余额不足QAQ");
                            System.out.println("是否继续转账");
                            System.out.println("1.是");
                            System.out.println("2.否");
                            int n = sc.nextInt();
                            if (n == 2) {
                                return;
                            }
                            continue;
                        }
                        ///////////////////
                        //确认无误后开始转账
                        //转账用户减钱
                        for (int i1 = 0; i1 < bank.size(); i1++) {
                            if (bank.get(i1).getIDCard() == intID) {
                                double allMoney = bank.get(i1).getAllMoney();
                                bank.get(i1).setAllMoney(allMoney - theMoney);
                            }
                        }

                        //目标用户加钱
                        for (int i1 = 0; i1 < bank.size(); i1++) {
                            if (bank.get(i1).getIDCard() == targetID) {
                                double allMoney = bank.get(i1).getAllMoney();
                                bank.get(i1).setAllMoney(allMoney + theMoney);

                            }
                        }
                        System.out.println("转账成功！");
                        return;
                    }

                }


            }
            System.out.println("未在系统中找到该卡号的用户");
            System.out.println("是否继续转账");
            System.out.println("1.是");
            System.out.println("2.否");
            int n = sc.nextInt();
            if (n == 2) {
                return;
            }

        }

    }


}