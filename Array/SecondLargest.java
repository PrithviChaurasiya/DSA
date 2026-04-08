package DSA.Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println("Second Largest Element : " + smax);
        sc.close();
    }
}
