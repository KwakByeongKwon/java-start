package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//      큰 범위에서 작은 범위로 이동할때 타입 변환은 안됌 앞에 변환해줄 타입을 명시해줘야됨 (명시적 형 변환)

//        intValue = doubleValue; // 타입을 명시해주지 않을 경우 컴파일 오류 발생
        intValue = (int)doubleValue; // 명시적 형 변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue); // 변수는 = 대입 연산자를 써야면 바뀜
    }
}
