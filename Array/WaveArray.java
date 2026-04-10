package DSA.Array;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int k= 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
