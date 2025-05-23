public class SimpleGithubSchoolProject {
    public static void main(String[] args) {
        // Example 1: Adding students to the school
        System.out.println("Adding students...");
        Student student = new Student("John", "Smith");
        School.addStudent(student);

        // Example 2: Displaying the total number of students in the school
        System.out.println("Total number of students in the school: " + School.totalStudents());

        // Example 3: Adding a teacher to the school
        Teacher teacher = new Teacher("John", "Smith");
        School.addTeacher(teacher);

        // Example 4: Displaying the total number of teachers in the school
        System.out.println("Total number of teachers in the school: " + School.totalTeachers());
    }
}

class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + "]";
    }
}

class Teacher {
    private String name;
    private String department;

    public Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", department=" + department + "]";
    }
}
