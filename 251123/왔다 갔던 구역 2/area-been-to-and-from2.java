import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[2000 + 1];
        
        int offset = 1000;
        int curr = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if (dir == 'R') {
                for (int j = curr + offset; j < curr + offset + x; j++) {
                    array[j]++;
                }
                curr += x;
            } else {
                for (int j = curr + offset; j > curr + offset - x; j--) {
                    array[j]++;
                }
                curr -= x;
            }
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
