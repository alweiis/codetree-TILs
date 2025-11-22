import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] dayOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int day1 = getDays(dayOfMonth, m1, d1); 
        int day2 = getDays(dayOfMonth, m2, d2);
        int diff = day2 - day1;
        String answer = "";

        if (diff >= 0) {
            answer = dayOfWeek[diff % 7];
        } else {
            answer = dayOfWeek[diff % 7 + 7];
        }
        System.out.print(answer);
    }

    private static int getDays(int[] arr, int m, int d) {
        int day = d;

        for (int i = 1; i < m; i++) {
            day += arr[i];
        }
        return day;
    }
}