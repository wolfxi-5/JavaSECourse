package com.whut.zhengchuang;

import java.util.Scanner;

public class TicketMachine {
    private int price;
    private int balance;    //the total money the customer has given so far
    private int total;      //the total money the machine got

    public TicketMachine()
    {
        System.out.println("choose the price of the ticket: 3 5 10");
        System.out.print("your choice:");
        Scanner input=new Scanner(System.in);
        int ticketCost = input.nextInt();
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    public int getPrice()
    {
        return price;
    }

    public int getBalance()
    {
        return balance;
    }

    //receive the money and check it
    public void insertMoney()
    {
        System.out.print("the money you want to insert:");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();

        if(money > 0) {
            balance += money;
            System.out.println("you have inserted:" + money);
            System.out.println("the balance:" + balance);
            System.out.println();
        }
        else System.out.println("Unavailable!");
    }

    //print a ticket
    public void printTicket()
    {
        if(balance >= price){
            System.out.println("YOUR TICKET:");
            System.out.println("the price:" + price);
            System.out.println("the balance:" + (balance - price));
            System.out.println();

            total += price;
            balance -= price;
        }
        else {
            System.out.println("it's unavailable!");
            System.out.println("you have insert at least:" + (price - balance));
            System.out.println();
        }
    }

    //return the money in the balance
    public void refundBalance()
    {
        System.out.println("do you want the refund: 0.No 1.Yes");
        System.out.print("your choice:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 1) {
            int refund;
            refund = balance;
            balance = 0;
            System.out.println("your refund：" + refund);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicketMachine ticket = new TicketMachine();

        ticket.insertMoney();
        ticket.printTicket();

        ticket.refundBalance();
        //ticket.printTicket();
    }
}
