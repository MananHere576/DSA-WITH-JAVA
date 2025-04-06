/*
 * A
 * B B
 * C C C
 * D D D D
 */
import java.util.*;
class Pattern13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(i + 'A') + " ");
            }
            System.out.println();
        }
    }
}