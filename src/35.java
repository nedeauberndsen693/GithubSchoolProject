public class SimpleGithubSchoolProject {
    public static void main(String[] args) {
        // Example 1: Adding new files
        System.out.println("Adding new file...");

        // Example 2: Moving a file
        File originalFile = new File("path/to/original/file.txt");
        File movedFile = new File(originalFile.getAbsolutePath() + "/new_file.txt");

        if (movedFile.exists()) {
            movedFile.renameTo(originalFile);
        }

        System.out.println("Moved file.");
    }
}
