package DSA.For_Loop;

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number of GP : ");
        int a = sc.nextInt();
        System.out.print("Enter The Common Ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print(a + " ");
            a*=r;
        }
        sc.close();
    }
}
