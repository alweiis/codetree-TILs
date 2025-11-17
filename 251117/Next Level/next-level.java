import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        
        UserInfo info1 = new UserInfo("codetree", 10);
        UserInfo info2 = new UserInfo();

        info2.id = id;
        info2.level = level;

        System.out.println("user " + info1.id + " lv " + info1.level);
        System.out.println("user " + info2.id + " lv " + info2.level);
    }
}

class UserInfo {
    public String id;
    public int level;

    UserInfo() {
        this.id = "";
        this.level = 0;
    }

    UserInfo(String id, int level) {
        this.id = id;
        this.level = level;
    }
}