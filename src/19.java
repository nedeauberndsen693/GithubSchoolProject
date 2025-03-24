import com.github.javafaker.Faker;

public class SimpleGithubSchoolProject {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().with姓() + " " + faker.name().with名() + "，1234567890");
    }
}
