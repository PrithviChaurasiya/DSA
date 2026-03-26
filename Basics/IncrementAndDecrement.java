package DSA.Basics;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //Increment Operator
        int x = 53;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);

        //Decrement Operator
        int y = 67;
        System.out.println(y);
        System.out.println(y--);
        System.out.println(--y);

        int a , b;
        a=7;
        b=a++;
        System.out.println(a +" "+ b);
    }
}
