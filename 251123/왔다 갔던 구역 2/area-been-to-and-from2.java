import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[2000 + 1];
        int start = 1001;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'R') {
                for (int j = start; j < x + start; j++) {
                    array[j]++;
                }
            } else {
                x = -x;
                for (int j = start; j >= x + start; j--) {
                    array[j]++;
                }
            }
            start += x;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}