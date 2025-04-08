import java.util.Scanner;

public class SimpleJavaProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        
        // User input for age and name
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print the result based on the user's choice
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (name.equals("Alice")) {
            System.out.println("Hello, Alice!");
        } else {
            System.out.println("I'm sorry, but I can't help you with that information.");
        }
    }
}
