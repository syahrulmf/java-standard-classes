package classes;

import java.util.Base64;

public class Base64Class {
  public static void main(String[] args) {

    /**
     *
     * Base64 yaitu encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
     * Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
     *
     */

    String original = "Syahrul Mubarok Nur Muhammad";

    String encoded = Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println(encoded);

    byte[] bytes = Base64.getDecoder().decode(encoded);
    String result = new String(bytes);

    System.out.println(result);

  }
}
