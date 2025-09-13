package Arrays;

import java.util.Scanner;

public class PassingInfunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 2 3
        5 6 7
        8 9 0
         */

        // int[][] arr = new int[3][];

        int[][] arr2D = {
            {1,2,3},// 0th index
            {5,7}, // 1st index
            {8,9,0,7} // 2nd index -> arr2D[2] = {8,9,0,7}
        };

        // input
        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for(int row = 0;row <arr.length ;row++){
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }
    }

}