package classes;

import java.util.Random;

public class RandomClass {
  public static void main(String[] args) {

    /**
     *
     * Random class adalah class yng bisa kita gunakan untuk men-generate random number
     *
     */

    Random random = new Random();

    for (int i = 0; i < 1000; i++) {
      int value = random.nextInt(1000);
      System.out.println(value);
    }

  }
}
