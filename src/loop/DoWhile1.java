package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 3){
            System.out.println("현재 숫자는: " + i);
            i++;
        }

        // 조건이 처음부터 거짓이면 아무것도 출력이 되지 않음으로 코드를 실행했는지 안했는지 헷갈릴 수 있음
    }
}
