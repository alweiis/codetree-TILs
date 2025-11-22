import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[201];
        
        int x1, x2;

        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt() + 100;
            x2 = sc.nextInt() + 100;

            for (int j = x1; j < x2; j++) {
                array[j] += 1;
            }
        }

        int max = Arrays.stream(array).max().getAsInt();
        System.out.print(max);
    }
}