package DSA.SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of th 1st array : ");
        m=sc.nextInt();
        System.out.print("Enter the size of th 2nd array : ");
        n=sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println("Enter the elements in 1st array : ");
        for (int i = 0; i < m; i++) 
            a[i]=sc.nextInt();
        System.out.println("Enter the elements in 2nd array : ");
        for (int i = 0; i < n; i++) 
            b[i]=sc.nextInt();
        int i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i<m && j<n) {
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else
                j++;
        }
        System.out.println(ans);
        sc.close();
    }
}
