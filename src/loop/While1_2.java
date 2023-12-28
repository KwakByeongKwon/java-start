package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            // count가 3이상 될떄까지 count에 +1 반복함.
            // while문의 () 안의 조건이 true일때만 반복
            count = count + 1;
            System.out.println("현재 숫자는: " + count);
        }

    }
}
