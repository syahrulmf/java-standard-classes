package classes;

public class StringClass {
  public static void main(String[] args) {
    /**
     *
     * Standard Method di String Class
     * [1] String toLowercase() -> Membuat string baru dengan format lowercase
     * [2] String toUppercase() -> Membuat string baru dengan format uppercase
     * [3] int length() -> Mendapatkan panjang string
     * [4] boolean startsWith(value) -> Mengecek apakah dimulai dengan string value
     * [5] boolean endsWith(value) -> Mengecek apakah diakhiri dengan string value
     * [6 ]String[] split(value) -> Memotong string dengan string value
     *
     */

    String name = "Syahrul Mubarok Nur Muhammad";
    String nameLowerCase = name.toLowerCase();
    String nameUpperCase = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameLowerCase);
    System.out.println(nameUpperCase);
    System.out.println(name.length());
    System.out.println(name.startsWith("Syahrul"));
    System.out.println(name.endsWith("Muhammad"));

    String[] names = name.split(" ");
    for (var value : names) {
      System.out.println(value);
    }

    System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());
    System.out.println(name.charAt(0));

    char[] chars = name.toCharArray();
    for (var value : chars) {
      System.out.println(value);
    }
  }
}
