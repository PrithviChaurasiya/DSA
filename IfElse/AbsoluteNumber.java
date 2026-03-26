package DSA.IfElse;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Print Absolute Value : ");
        int n = sc.nextInt();
        if(n>0)
            System.out.println(n);
        else
            System.out.println(n*(-1));
        sc.close();
    }
}
