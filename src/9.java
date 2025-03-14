import java.util.Random;

public class RandomCode {
  public static void main(String[] args) {
    // Generate a random number between 1 and 100
    int randNum = new Random().nextInt(100) + 1;
    
    // Print the random number to the console
    System.out.println("Random Number: " + randNum);
  }
}
