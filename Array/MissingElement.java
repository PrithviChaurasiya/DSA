package DSA.Array;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        int sum=0;
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n-1; i++) {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The Missing Element is : " + ((n*(n+1))/2-sum));
        sc.close();
    }
}
