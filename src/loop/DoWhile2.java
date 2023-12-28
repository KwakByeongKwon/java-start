package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
/*
do while문도 있음 먼저 실행을 한 뒤에 조건을 확인 한 후 조건이 참일때만 계속 반복
 */
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i < 3);
// 거짓이어도 한번은 무조건 실행

    }
}
