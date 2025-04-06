/* ****
 * ***
 * **
 * *
 * Print this pattern
 */

 import java.util.*;
 class Pattern5
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=m-1;j>=i;j--)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 }