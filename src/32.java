import org.javatuples.Pair;

public class SimpleGithubSchoolProject {

    public static void main(String[] args) {
        Pair<String, String> studentInfo = Pair.with("张三", "李四");
        System.out.println(studentInfo);
    }
}
