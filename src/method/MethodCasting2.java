package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 자동형변환이 가능한 경우에는 따로 형변환 해줄 필요 없음
                            // 정수형의 크기에 따라 작은값이 큰값으로 자동형변환 됌
    }

    public static void printNumber(double n){
        System.out.println("숫자: " + n);
    }
}
