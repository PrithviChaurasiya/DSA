package DSA.Methods;

import java.util.Scanner;

public class PermutationandCombination {
    public static int Factorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        double Combination;
        Combination=Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println("The Combination is : " + Combination);
        sc.close();
    }
}
