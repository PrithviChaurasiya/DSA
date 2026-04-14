package DSA.SortingAndSearching;

import java.util.Scanner;

public class MovingAllZerosToEnd {
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
            int swap=0;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0) {
                break;
            }
        }
        //int n-arr. length;
        //int j-0; 
        //for(int i-0;i<n;i++){
        //  if(arr[i]!=0){
        //      if(i!=j){
        //          int temp=arr[i];
        //          arr[i]=arr[j];
        //          arr[j]=temp;
        //      }
        //      j++}
        //}
        for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
