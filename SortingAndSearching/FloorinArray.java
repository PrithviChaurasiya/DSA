//Floor Element in the Array
package DSA.SortingAndSearching;

import java.util.Scanner;

public class FloorinArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element : ");
        int ele=sc.nextInt();
        int left=0,right=arr.length-1,idx=-1;
        while (left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]>ele)
                right=mid-1;
            else if(arr[mid]<=ele){
                idx=mid;
                left=mid+1;
            }
        }
        System.out.println(idx);
        sc.close();
    }
}
