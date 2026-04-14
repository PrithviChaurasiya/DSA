package DSA.Sorting;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target=sc.nextInt();
        int left=0,right=arr.length-1;
        int idx=-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]==target){
                idx=mid;
                right=mid-1;
            }

            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        System.out.println(idx);
        for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
