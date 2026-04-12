package DSA.Array;

import java.util.Scanner;

public class CheckSortedarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        boolean flag=true;
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n-1; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("The given array is sorted.");
        else System.out.println("The given array is not sorted.");
        sc.close();
    }
}
