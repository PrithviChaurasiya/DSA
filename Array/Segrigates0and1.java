package DSA.Array;

import java.util.Scanner;

public class Segrigates0and1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the 0s and 1s in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if (arr[i]==0) {
                i++;
            }
            else if(arr[j]==1)
                j--;
            
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for (int k= 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
