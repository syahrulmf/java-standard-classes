package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {

    /**
     *
     * Regular Expression
     * Regular expression atau disingkat regex adalah cara untuk melakukan pola pencarian
     * Biasanya dilakukan untuk pencarian dalam data String
     * Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya
     * Misal kita ingin mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dll
     *
     * Regex Package
     * Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern class dan Matcher class
     * Pattern Class adalah representasi hasil kompilasi dari pola regulan expression yang kita buat
     * Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat
     *
     */

    String name = "Syahrul Mubarok Nur Muhammad";

    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

    Matcher matcher = pattern.matcher(name);

    while (matcher.find()) {
      String result = matcher.group();
      System.out.println(result);
    }

  }
}
