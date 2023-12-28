package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2차원배열은 행과 열로 나누어줌
        int[][] arr = new int[10][10]; // 한번에 선언과 초기화도 가능함

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                arr[row][colum] = i;
                System.out.print(arr[row][colum]    + " ");
                i++;
            }
            System.out.println();
        }
    }
}
