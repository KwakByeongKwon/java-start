package method;

public class MethodRef1 {
    public static void main(String[] args) {


        int sum1 = add(1,2);
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(10,20);
        System.out.println("결과2 출력: " + sum2);

    }
    // 비슷한 연산을 수행하는 코드가 많을때 이렇게 하나로 묶어서 사용할 수 있음

    // 메서드의 이름 전에는 그 메서드를 뭐로 반환할지 반환될 타입을 정해야합니다.
    // 함수의 () 안에 정의된 매개변수들을 함수를 사용할때 대입할때 그 순서에 맞게 대입해줘야합니다.
    public static int add(int a, int b){
        System.out.println(a + " + " + b + "연산 수행");
        int sum = a + b;
        return sum;
    }
}
