import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt((10 - 1) + 1) + 1;
        System.out.println("Generated random number: " + randomNumber);
    }
}
