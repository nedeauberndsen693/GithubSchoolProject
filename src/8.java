import java.util.Random;
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(10);
        System.out.println("Generated random number: " + x);
    }
}
