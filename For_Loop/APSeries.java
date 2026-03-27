package DSA.For_Loop;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number of AP : ");
        int a = sc.nextInt();
        System.out.print("Enter Difference between Number : ");
        int d = sc.nextInt();
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();

        for (int i = a; i <= (a+(n-1)*d); i+=d) {
            System.out.println(i+" ");
        }
        
        sc.close();
    }
}
