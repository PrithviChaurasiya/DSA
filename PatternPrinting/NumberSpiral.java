package DSA.PatternPrinting;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int r = sc.nextInt();
        for (int i = 1; i <= (2*r-1); i++) {
            for (int j = 1; j <= (2*r-1); j++) {
                int a,b;
                a=i;
                b=j;
                if(a>r) a=2*r-a;
                if(b>r) b=2*r-b;
                if(a<b)
                    System.out.print(a);
                else{
                    System.out.print(b);
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
