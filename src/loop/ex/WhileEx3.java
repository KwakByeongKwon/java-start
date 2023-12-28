package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 3;
        int i = 1;
        while (true){
            sum += i;
            if (i == max){
                System.out.println("//max=" + max);
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}
