import java.util.Scanner;
public class Main {
    private static int MAX_K = 2 * 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int[][] matrix = new int[MAX_K][MAX_K];
        int offset = 100;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                for (int k = y1[i]; k < y2[i]; k++) {
                    matrix[j + offset][k + offset] = 1;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < MAX_K; i++) {
            for (int j = 0; j < MAX_K; j++) {
                if (matrix[i][j] == 1) area++;
            }
        }

        System.out.print(area);
    }
}