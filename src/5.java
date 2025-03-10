import java.util.Random;

public class RandomCode {
  public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt(10); // Generate a random number between 0 and 9
    System.out.println("Your random number is: " + number);
  }
}
