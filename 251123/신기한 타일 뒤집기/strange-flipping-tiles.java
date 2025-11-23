import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100000 + 1];
        
        int curr = 0;
        int offset = 100;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                for (int j = curr + offset; j < curr + offset + x; j++) {
                    arr[j] = 1;
                }
                curr += x;
            } else {
                for (int j = curr + offset - x; j < curr + offset; j++) {
                    arr[j] = -1;
                }
                curr -= x;
            }
        }

        int white = 0, black = 0;
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == -1) white++;
            if (arr[i] == 1) black++;
        }
        System.out.print(white + " " + black);
    }
}