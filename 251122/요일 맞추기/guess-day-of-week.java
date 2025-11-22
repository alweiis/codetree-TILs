import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int diff = getDays(m2, d2) - getDays(m1, d1)
        
        String answer = "";
        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if (diff >= 0) {
            answer = dayOfWeek[diff % 7];
        } else {
            answer = dayOfWeek[diff % 7 + 7];
        }
        System.out.print(answer);
    }

    private static int getDays(int m, int d) {
        int[] dayOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = d;

        for (int i = 1; i < m; i++) {
            totalDays += arr[i];
        }
        return totalDays
    }
}