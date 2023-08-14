package classes;

import java.util.UUID;

public class UUIDClass {
  public static void main(String[] args) {

    /**
     *
     * Saat membuat apk, kadang kita ada kasus ingin membuat data unique, misal untuk data primary key
     * Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier
     * UUID adalah format standard untuk membuat unique value yang telah terjamin
     *
     */

    for (int i = 0; i < 100; i++) {
      UUID uuid = UUID.randomUUID();
      String key = uuid.toString();

      System.out.println(key);
    }

  }
}
