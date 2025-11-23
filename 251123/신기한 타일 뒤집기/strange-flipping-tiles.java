import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000 + 1];
        
        int curr = 0;
        int offset = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'R') {
                int start = curr;
                int end = curr + (x - 1);

                for (int j = start; j <= end; j++) {
                    arr[j + offset] = 1;    // 검은색
                }
                curr = end; // 마지막으로 뒤집은 위치
            } else {
                int start = curr - (x - 1);
                int end = curr;

                for (int j = start; j <= end; j++) {
                    arr[j + offset] = -1;   // 흰색
                }
                curr = start; // 마지막으로 뒤집은 위치
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