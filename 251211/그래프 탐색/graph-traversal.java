import java.util.*;

public class Main {

    static List<List<Integer>> graph;
    static boolean[] visited;
    static int n, m, count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n : 정점의 수, m : 간선의 수
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n+1];

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        
        count = 0;
        visited[1] = true;
        DFS(1);

        System.out.println(count);
    }

    private static void DFS(int vertex) {
        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int curr = graph.get(vertex).get(i);
            if (!visited[curr]) {
                count++;
                visited[curr] = true;
                DFS(curr);
            }
        }
    }
}