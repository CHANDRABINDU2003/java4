
package ARRAY;

import java.util.Scanner;
public class ArrayDeletation {
    public static void main(String[] args) {
        System.out.println("give the index of array number");
        Scanner A = new Scanner(System.in);
        int n=A.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=A.nextInt();
        }
        System.out.println("give the index value you want to delete");
        int m= A.nextInt();
        int b[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                continue;
            }
            else
              b[i]=a[i+1];  
        }
        System.out.println("pint the value before delatation");
        for(int i=0;i<n;i++){
            System.out.println(""+a[i]);
        }
        System.out.println("pint the value after delatation");
        for(int i=0;i<n-1;i++){
            System.out.println(""+b[i]);
        }
    }
}
