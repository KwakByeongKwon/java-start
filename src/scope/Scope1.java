package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 0; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            // 변수의 범위는 {} 로를 기준으로 한다 자기보다 작은 {} 안의 변수는 사용할 수 없다
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        System.out.println("if m = " + m);
//        System.out.println("if x = " + x); // 자기보다 작은 {} 안에 변수는 사용 불가능함
    } // m 생존 종료
}
