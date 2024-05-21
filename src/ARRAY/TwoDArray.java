
package ARRAY;

import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.println("give the row number");
        int n= imp.nextInt();
         System.out.println("give the column number");
        int m= imp.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                a[i][j]=imp.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                System.out.print( " "+a[i][j] );
            }
            System.out.println("");
        }
    }
   
}
