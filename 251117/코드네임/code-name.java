import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[5];
        char name = ' ';
        int lowest = 100;

        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            users[i] = new User(codeName, score);
            if (score < lowest) {
                name = codeName;
                lowest = score;
            }
        }

        System.out.print(name + " " + lowest);
    }
}

class User {
    public char codeName;
    public int score;

    public User(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}