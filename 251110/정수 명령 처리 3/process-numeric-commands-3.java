import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int output = 100001;
            if (command.equals("push_front")) {
                int num = sc.nextInt();
                dq.addFirst(num);
            } else if (command.equals("push_back")) {
                int num = sc.nextInt();
                dq.addLast(num);
            } else if (command.equals("pop_front")) {
                output = dq.pollFirst();
            } else if (command.equals("pop_back")) {
                output = dq.pollLast();
            } else if (command.equals("size")) {
                output = dq.size();
            } else if (command.equals("empty")) {
                if (dq.isEmpty()) {
                    output = 1;
                } else {
                    output = 0;
                }
            } else if (command.equals("front")) {
                output = dq.peekFirst();
            } else if (command.equals("back")) {
                output = dq.peekLast();
            }
            if (output != 100001) {
                System.out.println(output);
            }
        }
        
    }
}