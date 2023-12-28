package cond;

public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status;
        // if문에 따라서 변수가 바뀔때 삼항 연산자를 이용해서 더 편하게 정의 할 수 있음.
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    }
}
