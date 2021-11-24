package 登陆系统;

import java.util.Scanner;

public class LogIn {
    private String account = "zhanghu";
    private String password = "mima";
    Scanner sc = new Scanner(System.in);


    public void login() {
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            String account = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            if (account.equals(this.account) && password.equals(this.password)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("登陆失败，你的账号已经被锁定！");
                    break;
                }
                System.out.println("账号密码错误！你还有" + (3 - i - 1) + "次机会！");
            }
        }


    }


}
