import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String answer;
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    answer = "No";
                    break;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            answer = "Yes";
        } else {
            answer = "No";
        }

        System.out.print(answer);
    }
}