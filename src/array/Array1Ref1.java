package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5]; // 배열

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
        // [] 배열의 인덱스 위치를 나태냄
        // 인덱스는 0부터 0 1 2 3 ... 증가함
    }
}
