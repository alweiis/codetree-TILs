import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.print("No");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}