package DSA.SortingAndSearching;

import java.util.Scanner;

public class PeakofaMountain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int left=0,right=arr.length-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }

            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
                left=mid+1;
            else
                right=mid-1;
        }
        for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
