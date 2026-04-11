package DSA.Array;

import java.util.Scanner;

public class merge2sortedarray {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of th 1st array : ");
        m=sc.nextInt();
        System.out.print("Enter the size of th 2nd array : ");
        n=sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        int[] ans = new int[m+n];
        for (int i = 0; i < m; i++) 
            a[i]=sc.nextInt();
        for (int i = 0; i < n; i++) 
            b[i]=sc.nextInt();
        int i=0,j=0,k=0;
        while (i < a.length && j < b.length) {
            if(a[i]<b[j])
                ans[k++]=a[i++];
            else
                ans[k++]=b[j++];
        }
        if(i!=a.length)
            ans[k++]=a[i++];
        if(j!=b.length)
            ans[k++]=b[j++];
        for (int ele : ans) {
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
