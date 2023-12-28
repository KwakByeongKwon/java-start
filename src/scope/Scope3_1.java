package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0 ; // 블럭 내부 에서 변수를 외부 블럭에서도 사용하려면 외부에서 변수를 정의해 놓고 내부에서 사용하면 됌
        if (m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
