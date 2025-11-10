import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }

        while(!que.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                que.add(que.poll());
            }
            System.out.print(que.poll() + " ");
        }
    }
}