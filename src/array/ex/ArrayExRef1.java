package array.ex;

public class ArrayExRef1 {
    public static void main(String[] args) {
        int[] students = new int[5];

        int num = 90;

        int total = 0;
        double average = 0.0;

        for (int i = 0; i < students.length; i++) {
            students[i] = num;
            num -= 10;
            total += students[i];
        }
        average = (double)total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
