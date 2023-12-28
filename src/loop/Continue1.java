package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if (i == 3){
                i++;
                continue;
            }
            // continu를 만나면 그 코드가 더이상 진행되지 않고 다음으로 그냥 건너뜀
            System.out.println(i);
            i++;
        }
    }
}
