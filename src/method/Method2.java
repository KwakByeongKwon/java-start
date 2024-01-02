package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader(){ // 반환값이 필요 없는경우 void로 설정해줌 반환값이 없으므로 변수에 정의해줄 수 없다.
        System.out.println("= 프로그램을 시작합니다 =");
        return; // 모든 메서드는 return 을 해주어야 하는데 void는 예외로 생략 가능합니다.
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
