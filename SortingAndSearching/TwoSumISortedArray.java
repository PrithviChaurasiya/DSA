package DSA.SortingAndSearching;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumISortedArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=n-1;
        System.out.print("Enter the target element : ");
        int target=sc.nextInt();
        while(i<j){
            if (arr[i]+arr[j]==target) {
                System.out.println("Target hit : "+arr[i] +" "+arr[j]);
            }
            else if(arr[i]+arr[j]<target) i++;
            else j--;
        }
        sc.close();
    }
}
