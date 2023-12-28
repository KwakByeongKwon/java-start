package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부 for문 내
            System.out.println("for m = " + m); // 블록 내부에서 외부로는 접근 가능
            System.out.println("for i = " + i);
        }
        System.out.println("for m = " + m);
//        System.out.println("for i = " + i);  // 블록 외부에서 내부로는 접근 불가능
    }
}
