import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        SecretInformation sInfo = new SecretInformation(sCode, mPoint, time);

        System.out.println("secret code : " + sInfo.sCode);
        System.out.println("meeting point : " + sInfo.mPoint);
        System.out.println("time : " + sInfo.time);
    }
}

class SecretInformation {
    String sCode;
    char mPoint;
    int time;

    SecretInformation(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}