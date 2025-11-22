import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        if (sb.length() == 0) {
            sb.append(0);
        }
        sb.reverse();
        System.out.print(sb.toString());
    }
}