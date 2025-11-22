import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int start = getTotalDays(m1, d1);
        int end = getTotalDays(m2, d2);
        int diff = end - start; // end가 start보다 같거나 큼이 보장됨

        // 요일 인덱스: Mon=0, Tue=1, ..., Sun=6
        String[] dayOfWeek = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int targetIdx = -1;
        for (int i = 0; i < 7; i++) {
            if (dayOfWeek[i].equals(A)) {
                targetIdx = i;
                break;
            }
        }

        int N = diff + 1;          // 포함된 총 날짜 수
        int fullWeeks = N / 7;     // 각 요일이 최소 한 번씩 등장하는 횟수
        int r = N % 7;             // 남는 일수 (offset 0..r-1)

        int count = fullWeeks + (targetIdx < r ? 1 : 0);
        System.out.println(count);
    }

    private static int getTotalDays(int m, int d) {
        // 2024년 윤년 기준
        int[] dayOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = d;
        for (int i = 1; i < m; i++) {
            total += dayOfMonth[i];
        }
        return total;
    }
}