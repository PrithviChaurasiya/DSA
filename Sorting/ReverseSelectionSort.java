package DSA.Sorting;

import java.util.Scanner;

public class ReverseSelectionSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int max=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[max]) {
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
