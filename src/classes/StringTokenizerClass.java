package classes;

import java.util.StringTokenizer;

public class StringTokenizerClass {
  public static void main(String[] args) {

    /**
     *
     * StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjado token atau string yang lebih kecil
     * Kita bisa memotong string dengan delimiter yang kita mau
     *
     */

    String value = "Syahrul Mubarok Nur Muhammad";
    StringTokenizer tokenizer = new StringTokenizer(value, " ");

    while(tokenizer.hasMoreTokens()){
      String result = tokenizer.nextToken();
      System.out.println(result);
    }

  }
}
