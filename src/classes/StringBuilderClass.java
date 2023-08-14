package classes;

public class StringBuilderClass {
  public static void main(String[] args) {

    /**
     *
     * StringBuffer / StringBuilder digunakan untuk memanipulasi String
     * Bedanya StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
     * Jika ingin memanipulasi String secara paralel bersanaan, disarankan menggunakan StringBuffer
     * Jika tidak butuh paralel, cukup gunakan StringBuilder
     * Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat
     *
     */

    StringBuilder builder = new StringBuilder();
    builder.append("Syahrul");
    builder.append(" ");
    builder.append("Mubarok");
    builder.append(" ");
    builder.append("Nur");
    builder.append(" ");
    builder.append("Muhammad");

    String name = builder.toString();
    System.out.println(name);

  }
}
