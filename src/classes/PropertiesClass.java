package classes;

import java.io.*;
import java.util.Properties;

public class PropertiesClass {
  public static void main(String[] args) {

    /**
     *
     * Kebanyakan app java akan menyimpan konfigurasi fila dalam bentuk properties file
     * Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=)
     * Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita
     * Properties Class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
     *
     */

    try {
      Properties properties = new Properties();

      properties.load(new FileInputStream("application.properties"));

      String host = properties.getProperty("database.host");
      String port = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);

    } catch (FileNotFoundException exception) {
      System.out.println("File tidak ditemukan");
    } catch (IOException exception) {
      System.out.println("Gagal load data dari file");
    }


    try {
      Properties properties = new Properties();
      properties.put("name.first", "Syahrul Mubarok");
      properties.put("name.last", "Nur Muhammad");

      properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama");
    } catch (FileNotFoundException exception) {
      System.out.println("Error membuat properties");
    } catch (IOException e) {
      System.out.println("Error menyimpan properties");
    }

  }
}
