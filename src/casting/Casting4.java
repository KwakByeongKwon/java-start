package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // 1.5지만 int형이므로 소수점 제외 1이 들어감
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // 1.5지만 int형으로 계산 후 double형으로 바뀐것으로 1에서 double형으로 형변환 되서 1.0
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5가 나옴
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; // 1.5가 나옴
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
