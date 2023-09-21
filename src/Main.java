import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + b);
                scanner.nextLine(); // Consume the remaining newline character

                String operation = scanner.nextLine();

                int result;
                switch (operation) {
                        case "sum":
                                result = a + b;
                                break;
                        case "mul":
                                result = a * b;
                                break;
                        default:
                                System.out.println("Invalid operation");
                                return; // Stop the program if the operation is invalid
                }

                System.out.println("Result: " + result);
        }
}