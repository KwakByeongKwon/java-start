package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("입력한 정수들 역순으로 출력");
        for (int i = arr.length-1; i >= 0; i--) {
            if (i != 0){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }

        }

    }
}
