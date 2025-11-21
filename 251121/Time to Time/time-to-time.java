import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int time1 = 60 * a + b;
        int time2 = 60 * c + d;
        System.out.print(time2 - time1);
    }
}