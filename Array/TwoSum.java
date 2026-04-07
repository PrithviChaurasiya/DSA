package DSA.Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        int targetsum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]+arr[j]==targetsum){
                    System.out.println("The indices are : "+i+" "+ j);
                }
            }
        }
        sc.close();
    }
}
