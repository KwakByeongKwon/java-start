package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 동시에 초기화 시킬 수 있음.



        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
