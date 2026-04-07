package DSA.Array;

import java.util.Scanner;

public class Searchelement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int Search = sc.nextInt();
        boolean Found=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Search) {
                Found=true;
            }
            else
                Found=false; 
        }
        if (Found) {
            System.out.println("Element Found");

        }
        else
            System.out.println("Not Found");
        sc.close();
    }
}
