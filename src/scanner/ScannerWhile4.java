package scanner;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                System.out.print("상품명을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int count = sc.nextInt();


                System.out.printf("상품명:%s 가격:%d 수량:%d\n",name,price,count);
                sum += (price*count);
            } else if (num == 2) {
                System.out.printf("총 비용: %d\n",sum);
            } else if (num == 3) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
