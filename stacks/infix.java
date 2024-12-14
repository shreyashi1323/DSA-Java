package stacks;
import java.util.*;

public class infix {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.isEmpty()) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && (op.peek() == '+' || op.peek() == '-' || op.peek() == '*' || op.peek() == '/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char operator = op.pop();

                        switch (operator) {
                            case '+':
                                val.push(v1 + v2);
                                break;
                            case '-':
                                val.push(v1 - v2);
                                break;
                            case '*':
                                val.push(v1 * v2);
                                break;
                            case '/':
                                val.push(v1 / v2);
                                break;
                        }
                    }
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char operator = op.pop();

                        switch (operator) {
                            case '*':
                                val.push(v1 * v2);
                                break;
                            case '/':
                                val.push(v1 / v2);
                                break;
                        }
                    }
                    op.push(ch);
                }
            }
        }

        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();

            switch (operator) {
                case '+':
                    val.push(v1 + v2);
                    break;
                case '-':
                    val.push(v1 - v2);
                    break;
                case '*':
                    val.push(v1 * v2);
                    break;
                case '/':
                    val.push(v1 / v2);
                    break;
            }
        }

        System.out.println(val.peek());
    }
}
