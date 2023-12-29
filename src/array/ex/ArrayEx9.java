package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productCount = 0;
        int maxProduct = 10;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        while (true){
            System.out.print("1.상품 등록, 2.상품 목록, 3.종료\n메뉴를 선택하세요:");
            int select = sc.nextInt();
            sc.nextLine();

            if (select == 1){
                if (productCount <= maxProduct){
                    System.out.print("상품 이름을 입력하세요:");
                    productNames[productCount] = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요:");
                    productPrices[productCount] = sc.nextInt();
                    sc.nextLine();
                    productCount++;
                } else {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }

            } else if (select == 2) {
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.printf("%s: %d원\n",productNames[i],productPrices[i]);
                }
            } else if (select == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");
                continue;
            }
        }


    }
}
