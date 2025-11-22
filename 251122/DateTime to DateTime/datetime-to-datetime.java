import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int time1 = 60 * 24 * 11 + 60 * 11 + 11;
        int time2 = 60 * 24 * A + 60 * B + C;
        int answer = time2 - time1;
        
        if (answer < 0) answer = -1;
        System.out.print(answer);
    }
}