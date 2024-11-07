import java.util.ArrayDeque;
import java.util.Scanner;

public class EpicWizardingDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputString = scanner.nextLine().toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean test = true;
        boolean pushExclamation = true;

        for (var ch : inputString) {
            if (ch == '/' || ch == '<') {
                stack.push(ch);
            } else if (ch == '!' && pushExclamation) {
                stack.push(ch);
                pushExclamation = false;  // if Exclamation Mark was push in stack
            } else {
                char lastInStack = stack.pop();
                switch (ch) {
                    case '\\':
                        if (lastInStack == '/') {
                            test = true;
                        } else {
                            test = false;
                        }
                        break;
                    case '>':
                        if (lastInStack == '<') {
                            test = true;
                        } else {
                            test = false;
                        }
                        break;
                    case '!':
                        if (lastInStack == '!') {
                            test = true;
                            pushExclamation = true;
                        } else {
                            test = false;
                        }
                        break;
                    default:
                        test = false;
                }
            }
            if (!test) {
                break;
            }
        }

        if (test && stack.isEmpty()) {
            System.out.println("Epic");
        } else {
            System.out.println("Not Epic");
        }

    }
}
