package classes;

import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args) {

    /**
     *
     * Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console dll
     * Method di Scanner Class :
     *
     * nextLine() -> Membaca string
     * nextInt() -> Membaca int
     * nextLong() -> Membaca long
     * nextBoolean() -> Membaca boolean
     * ...dan masih banyak
     *
     */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nama : ");
    String name = scanner.nextLine();

    System.out.println("Hello " + name);
  }
}
