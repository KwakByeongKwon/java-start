package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100;
        // endNum 만큼 반복

        while (i <= endNum){
            sum = sum + i;
            System.out.println("i = " + i + "sum = " + sum);
            i++;
        }

    }
}