package cond;

public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;

        // 자바 14부터 기존 switch문이 바뀌어서 나옴
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
