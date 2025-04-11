import java.util.Scanner;

public class SimpleGithubSchoolProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Github School Project.");

        while (true) {
            System.out.println("\n1. Add a project");
            System.out.println("2. Remove a project");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Add a new project:");
                    addNewProject(scanner);
                    break;
                case 2:
                    System.out.println("Remove an existing project:");
                    removeExistingProject(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addNewProject(Scanner scanner) {
        System.out.print("Enter the name of the new project: ");
        String projectName = scanner.nextLine();

        System.out.print("Enter a description for the project: ");
        String projectDescription = scanner.nextLine();

        System.out.println("\n" + projectName + " has been added successfully.");
    }

    private static void removeExistingProject(Scanner scanner) {
        System.out.print("Enter the name of the project you want to remove: ");
        String projectNameToRemove = scanner.nextLine();

        if (projectManager.removeProject(projectNameToRemove)) {
            System.out.println("\n" + projectNameToRemove + " has been removed successfully.");
        } else {
            System.out.println("\nNo projects found with the name \"" + projectNameToRemove + "\".");
        }
    }
}
