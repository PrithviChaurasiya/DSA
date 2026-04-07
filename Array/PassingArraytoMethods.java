package DSA.Array;

public class PassingArraytoMethods {
    public static void main(String[] args) {
        int[] arr = {10,34,25,67,55};
        System.out.println(arr[3]);
        change(arr);
        System.out.println(arr[3]);
    }
    public static void change(int[] x) {
        x[3] = 44;
    }
}

//When ever we pass array to methods the array is passed by reference