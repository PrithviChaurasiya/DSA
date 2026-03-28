package DSA.PatternPrinting;

import java.util.Scanner;

public class StarSqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
