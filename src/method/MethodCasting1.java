package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); 메서드랑 변수가 타입이 맞지 않으면 컴파일 오류가나옴
        printNumber((int)number); // 형 변환을 해주면 오류가 안남
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
