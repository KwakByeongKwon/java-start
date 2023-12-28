package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//  위의 향산된 for문과 같은 for문

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);


    }
}
