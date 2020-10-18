package package01.first;

public class TicketMachine {
        int price;
        int balance;
        int total;

        void setPrice(int price) {
            this.price = price;
        }

        void insertMoney(int amount) {
            balance += amount;
        }

        int getBalance() {
            return balance;
        }

        void print() {
            System.out.println("==============================");
            System.out.println("This is a ticket");
            System.out.println("price : " + price);
            System.out.println("==============================");
            balance -= price;
            total += price;
        }

        int refund() {
            int result = balance;
            balance = 0;
            return result;
        }

        int getTotal() {
            return total;
        }

        void reset() {
            balance = 0;
            total = 0;
        }
}


