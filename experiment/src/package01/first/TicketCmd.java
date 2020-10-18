package package01.first;

import java.util.Scanner;

public class TicketCmd {

    public static void main(String[] args) {
        TicketMachine ticket = new TicketMachine();
        ticket.setPrice(2);

        while (true) {
            System.out.println("===============欢迎使用自动售票机===============");
            System.out.println("本机销售固定票价" + ticket.price + "元的车票");
            Scanner in = new Scanner(System.in);

            while (true) {
                System.out.println("请选择服务...");
                System.out.println("1、投币");
                System.out.println("2、打印车票");
                System.out.println("3、找零");

                String n = in.next();
                switch (n) {
                    case "1":
                        //int money = in.nextInt();
                        ticket.insertMoney(in.nextInt());
                        System.out.println("当前余额：" + ticket.getBalance() + "元");
                        break;
                    case "2":
                        ticket.print();
                        System.out.println("当前余额：" + ticket.getBalance() + "元");
                        break;
                    case "3":
                        System.out.println("请收好找零" + ticket.refund() + "元");
                        System.out.println();
                        break;
                    case "reset":
                        System.out.println("本次运营总收入" + ticket.getTotal() + "元");
                        ticket.reset();
                        System.exit(0);
                        //break;
                    default:
                        System.out.println("请输入正确的序号：");
                }
            }
        }

    }
}
