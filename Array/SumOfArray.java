package DSA.Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of the elements of an array is : " + sum);
        sc.close();

    }
}
