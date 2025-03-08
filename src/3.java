import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10); // This will generate a random integer between 0 and 9
        System.out.println("The random number is: " + number);
    }
}
