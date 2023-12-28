package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        // 이를 수만번 반복한다고 가정하면 하나하나 일일히 다 복사 붙여넣기 하면 가능하겠지만
        // 반복문을 사용하면 더 간결하게 표현 가능함
    }
}
