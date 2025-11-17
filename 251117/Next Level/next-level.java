import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        UserInfo info1 = new UserInfo();
        info1.id = "codetree";
        info1.level = 10;

        UserInfo info2 = new UserInfo();

        String id = sc.next();
        int level = sc.nextInt();

        info2.id = id;
        info2.level = level;

        System.out.println("user " + info1.id + " lv " + info1.level);
        System.out.println("user " + info2.id + " lv " + info2.level);
    }
}

class UserInfo {
    public String id;
    public int level;

    public UserInfo() {
        this.id = "";
        this.level = 0;
    }

    public UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }
}