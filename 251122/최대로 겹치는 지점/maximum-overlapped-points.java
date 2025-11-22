import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100 + 1];

        int start, end;
        for (int i = 0; i < n; i++) {
            start = sc.nextInt();
            end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.print(max);
    }
}