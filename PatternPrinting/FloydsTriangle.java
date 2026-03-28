package DSA.PatternPrinting;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height : ");
        int r = sc.nextInt();
        int a = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}
