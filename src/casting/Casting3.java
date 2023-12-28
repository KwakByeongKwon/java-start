package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 초과
        int intValue = 0;

        intValue = (int) maxIntValue;; //형변환 int 범위까지는 형 변환 가능함
        System.out.println("maxIntValue casting " + intValue);

        intValue = (int) maxIntOver;; //int 범위를 초과하면 그 범위의 제일 작은 값부터 하나씩 증가하게됌 시계가 돌듯이
        System.out.println("maxIntValue casting " + intValue);
    }
}
