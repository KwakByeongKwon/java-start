package operator.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;
        double average = sum / 3; // double 이므로 소수자리 나옴

        System.out.println(sum);
        System.out.println(average);

    }
}
