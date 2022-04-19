//package COA_Ass;
import java.util.*;

class matrixmulti_int {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of matrix (32, 64, 128, 256, 512):");
        int n = scan.nextInt();
        scan.close();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[a.length][b[0].length];

        long start2 = System.nanoTime();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                a[i][j] = (int)(Math.random()*10);
                b[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b[i].length; j++) {
                for(int k=0; k<b.length; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        long end2 = System.nanoTime();
        long elapsedTime2 = end2 - start2;

        System.out.println("\nWe have generated two matrices with random numbers of size "+n+"x"+n+". We have multiplied them and the resultant matrix will be: -\n");
        for(int i=0; i<c.length; i++) {
            for(int j=0; j<c[0].length; j++) {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        long end1 = System.nanoTime();
        long elapsedTime1 = end1 - start1;

        System.out.println("\n"+"Total program Execution time "+elapsedTime1+"ns");
        System.out.println("Meat portion execution time "+elapsedTime2+"ns");
    }
}