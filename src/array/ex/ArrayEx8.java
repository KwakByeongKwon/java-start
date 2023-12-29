package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 를 입력하세요: ");
        int studentCount = sc.nextInt();
        String[] subject = {"국어", "영어", "수학"};
        int[][] students = new int[studentCount][subject.length];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(subject[j] + " 점수:");
                students[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            double average ;
            for (int j = 0; j < students[i].length; j++) {
                sum += students[i][j];
            }
            average = (double) sum / students[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }



    }
}
