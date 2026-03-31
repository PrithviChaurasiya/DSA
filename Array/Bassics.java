package DSA.Array;

import java.util.Scanner;

public class Bassics {
    public static void main(String[] args) {
        
        //initializing and decleration

        int[] arr={1,2,3,4,5,6}; 
        
        //initializaton the array

        int[] arr1=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an array");
        
        //Decleration

        for (int i = 0; i < 10; i++) {
            arr1[i]=sc.nextInt();
        }
        
        //Updating Values in an array

        arr[4]=9;
        System.out.println(arr[4]);
        sc.close();

        //Output of an array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
}
