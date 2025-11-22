import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] array = new int[N+1];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; i <= B; j++) {
                array[j] += 1;
            }
        }

        int max = Arrays.stream(array).max().getAsInt();
        System.out.print(max);
    }
}