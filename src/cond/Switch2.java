package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;
//      if문이랑 비슷함 if문보다 는 보다 직관적임
//      break를 쓰지 않으면 마지막까지 다 실행됌
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
