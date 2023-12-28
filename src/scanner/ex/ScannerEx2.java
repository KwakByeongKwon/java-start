package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.printf("입력한 숫자 %d은(는) 짝수입니다.",num);
        } else if (num % 2 != 0) {
            System.out.printf("입력한 숫자 %d은(는) 홀수입니다.",num);
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
