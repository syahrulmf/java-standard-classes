package classes;

import java.util.StringJoiner;

public class StringJoinerClass {
  public static void main(String[] args) {

    /**
     *
     * StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan delimiter
     * StringJoiner juga mendukung prefix dan suffic jika kita ingin menambahkannya
     * Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau
     *
     */

    StringJoiner joiner = new StringJoiner(", ", "[", "]");

    joiner.add("Syahrul");
    joiner.add("Mubarok");
    joiner.add("Nur");
    joiner.add("Muhammad");

    String value = joiner.toString();
    System.out.println(value);

  }
}
