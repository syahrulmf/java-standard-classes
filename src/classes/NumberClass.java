package classes;

public class NumberClass {
  public static void main(String[] args) {

    /**
     *
     * Semua number class yang bukan primitif memilik parent class yang sama, yaitu class Number
     * Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
     * Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
     *
     * Method di Number Class :
     * [1] byte byteValue() -> mengubah menjadi tipe byte
     * [2] double doubleValue() -> Mengubah menjadi tipe double
     * [3] float floatValue() -> Mengubah menjadi tipe float
     * [4] int intValue() -> Mengubah menjadi tipe int value
     * [5] long longValue() -> Mengubah menjadi long value
     * [6] short shortValue() -> Mengubah menjadi shor value
     *
     */

    Integer intValue = 10;

    Long longValue = intValue.longValue();
    Double doubleValue = intValue.doubleValue();
    Short shortValue = intValue.shortValue();

    /**
     *
     * Konversi String ke Number
     * Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke Number
     * parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
     * valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
     * Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number
     *
     */

    String contoh = "10000";

    Integer contohInt = Integer.valueOf(contoh);
    Double contohDouble = Double.valueOf(contoh);
    System.out.println(contohInt);
    System.out.println(contohDouble);

  }
}
