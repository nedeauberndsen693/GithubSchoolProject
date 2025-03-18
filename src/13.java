
import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(10);
        System.out.println("The number is: " + x);
    }
}