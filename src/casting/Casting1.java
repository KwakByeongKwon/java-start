package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 0;
        long longValue;
        double doubleValue;
//      작은 범위에서 큰범위로 이동할때 타입 변환은 자동으로 변환되서 들어감 "자동 형 변환"
        longValue = intValue; // int -> long 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double 가능
        System.out.println("doubleValue = " + doubleValue)  ;
    }
}
