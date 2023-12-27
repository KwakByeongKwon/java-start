package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } // if문에서 True가 나오면 그 즉시 바로 조건문 탈출 밑에 조건이 또 있어도 실행하지 않고 탈출함
        else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

    }
}
