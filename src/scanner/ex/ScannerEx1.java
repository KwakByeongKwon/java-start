package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String str = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int intValue = sc.nextInt();

        System.out.printf("당신의 이름은 %s 이고, 나이는 %d 입니다.",str,intValue);
    }
}
