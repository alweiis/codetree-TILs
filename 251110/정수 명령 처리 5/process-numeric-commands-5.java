import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String command = sc.next();
            if (command.equals("push_back")) {
                int number = sc.nextInt();
                list.add(number);
            } else if (command.equals("pop_back")) {
                list.remove(list.size() - 1);
            } else if (command.equals("size")) {
                System.out.println(list.size());
            } else if (command.equals("get")) {
                int idx = sc.nextInt();
                System.out.println(list.get(idx - 1));
            }
        }
    }
}