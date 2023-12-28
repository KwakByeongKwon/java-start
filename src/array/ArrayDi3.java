package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2차원배열은 행과 열로 나누어줌
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        }; // 한번에 선언과 초기화도 가능함

//        arr[0][0]= 1; // 0행 0열
//        arr[0][1]= 2; // 0행 1열
//        arr[0][2]= 3; // 0행 2열
//        arr[1][0]= 4; // 1행 0열
//        arr[1][1]= 5; // 1행 1열
//        arr[1][2]= 6; // 1행 2열

        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum]    + " ");
            }
            System.out.println();
        }
    }
}
