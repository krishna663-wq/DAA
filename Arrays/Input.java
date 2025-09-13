package Arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 25;
        arr[2] = 233;
        arr[3] = 56;
        arr[4] = 2;

        // System.out.println(arr[3]);

        // input using for loops
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i] + " ");
        // }
        // for(int num : arr){
        //     System.out.println(num + " "); // here num represents element of the array
        // }
        // System.out.println(arr[5]); // index out of bound error
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        // System.out.println(Arrays.toString(str));
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }
    
}
