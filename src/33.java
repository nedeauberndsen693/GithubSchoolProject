import java.util.Scanner;

public class GithubCodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        if (name.isEmpty()) {
            System.out.println("Please enter a valid name.");
            return;
        }
        
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        
        if (age < 18) {
            System.out.println(name + " is not allowed to attend this course.");
        } else {
            System.out.println(name + " is allowed to attend this course.");
        }
    }
}
