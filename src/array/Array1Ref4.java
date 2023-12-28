package array;

public class Array1Ref4 {

    public static void main(String[] args) {
//        int[] students = {90, 80, 70, 60, 50}; // 따로 선언하고 초기화 하지 않아도 바로 선언과 동시에 초기화가 가능함.
        // 이때는 선언과 동시에 초기화를 꼭 해줘야함. 선언 따로 초기화 따로하면 오류가나옴.
        int[] students = new int[]{90, 80, 70, 60, 50}; // 생성과 동시에 초기화


        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
