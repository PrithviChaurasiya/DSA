package DSA.Basics;

public class TypeCasting {
    public static void main(String[] args) {
        //Character To Integer
        
        char ch = 'A';
        System.out.println(ch); 
        System.out.println(ch+0); // Type Conversion
        int a = ch; //Implicit Type Casting
        System.out.println(a); // Type Conversion
        
        // Integer to Character
        int x=4;
        char ch1=(char) x; //Explicit Type Casting
        System.out.println(ch1);
    }

}
