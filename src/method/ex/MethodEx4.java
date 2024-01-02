package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");

            System.out.print("선택: ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1){
                System.out.print("입금액을 입력하세요: ");
                amount = sc.nextInt();
                balance = deposit(balance,amount); // 입금
            } else if (num == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = sc.nextInt();
                balance = withdraw(balance,amount); // 출금
            } else if (num == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (num == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

        }
    }
    public static int deposit(int balance,int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(int balance, int amount){
        if (balance < amount){
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }
}
