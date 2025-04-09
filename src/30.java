import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);

        Collections.sort(students);

        for (String student : students) {
            System.out.println(student + " scored: " + studentScores.getOrDefault(student, 0));
        }
    }
}
