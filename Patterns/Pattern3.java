/* 1
 * 12
 * 123
 * 1234
 * Print this pattern
 */

 import java.util.*;
 class Pattern3
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 System.out.print(j+1);
             }
             System.out.println();
         }
     }
 }