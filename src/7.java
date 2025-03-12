import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    int min = 10;
    int max = 20;
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    System.out.println("Random number: " + randomNum);
  }
}
