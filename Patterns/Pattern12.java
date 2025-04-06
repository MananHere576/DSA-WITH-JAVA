/*
 * A
 * A B
 * A B C
 * A B C D
 */
import java.util.*;
class Pattern12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(j + 'A') + " ");
            }
            System.out.println();
        }
    }
}