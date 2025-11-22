import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        int diff = getTotalDays(m2, d2) - getTotalDays(m1, d1);
        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        int count = diff / 7;
        if (A.equals(dayOfWeek[diff % 7])) {
            count++;
        }
        System.out.println(count);
    }

    private static int getTotalDays(int m, int d) {
        int[] dayOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = d;

        for (int i = 1; i < m; i++) {
            totalDays += dayOfMonth[i];
        }
        return totalDays;
    }
}