
package ARRAY;

import java.util.Scanner;
public class ArrayUser {
    public static void main(String[] args) {
        System.out.println("give the number of index");
        Scanner inp= new Scanner(System.in);
        int n = inp.nextInt();
        int a[]=new int [n];
        System.out.println("Give the numbers");
        for(int i=0;i<n;i++){
            a[i]=inp.nextInt();
        }
        int b[]=new int[n+1];
        System.out.println("give the index value you want to change");
        int m=inp.nextInt();
        System.out.println("enter the new value");
        int p = inp.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<m)
            { b[i]=a[i];}
            else if (i == m){
                
                    b[i]=p;
                            
                            }
            else
            {
                b[i]=a[i-1];
            }}
            System.out.println("print the values");
            for(int  i=0;i<n+1;i++){
                System.out.println(""+b[i]);}
        }
    }
  

