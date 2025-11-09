import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++ ){
            String command = sc.next();
            if (command.equals("push")) {
                int number = sc.nextInt();
                que.add(number);
            } else if (command.equals("front")) {
                System.out.println(que.peek());
            } else if (command.equals("size")) {
                System.out.println(que.size());
            } else if (command.equals("empty")) {
                int isEmpty = 0;
                if (que.isEmpty()) {
                    isEmpty = 1;
                }
                System.out.println(isEmpty);
            } else if (command.equals("pop")) {
                System.out.println(que.poll());
            } 
        }
    }
}