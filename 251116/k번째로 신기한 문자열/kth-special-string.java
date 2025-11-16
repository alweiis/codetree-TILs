import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int idx = 1;
        Arrays.sort(words);
        for (String word: words) {
            if (word.startsWith(t)) {
                if (idx == k) {
                    System.out.print(word);
                }
                idx++;
            }
        }
    }
}