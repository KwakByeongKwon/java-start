package overloading;
// 메서드 시그니처 = 메서드 이름 + 메서드 타입(순서) 로 메서드 오버로딩을 할 수 있다.
public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
// 메서드의 매개변수의 타입의 순서에 따라도 정해짐
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }
    public static void myMethod(double a, int b){
        System.out.println("double a, int b");

    }
}
