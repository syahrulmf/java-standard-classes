package classes;

public class RuntimeClass {
  public static void main(String[] args) {

    /**
     *
     * Ketika aplikasi Java kita berjalan, kita bisa melihat informasi enviroment tempat aplikasi java berjalan
     * Informasi itu terdapat di class Runtime
     * Class Runtime tidak bisa dibuat secara otomatis, secara otomatis Java akan membuat single object.
     * Kita bisa mengakses object tsb menggunakan static method getRuntime() milik class Runtime
     *
     * Method di Runtime Class :
     * [1] int availableProcessors() -> Mendapatkan jumlah core cpu
     * [2] long freeMemory() -> Mendapatkan jumlah memory bebas di JVM
     * [3] long totalMemory() -> Mendapatkan jumlah total memory di JVM
     * [4] long maxMemory() -> Mendapatkan jumlah maksimum memory di JVM
     * [5] void gc() -> Menjalankan garbage collector u/ menghilangkan data di memory yg sudah tdk terpakai
     *
     */

    Runtime runtime = Runtime.getRuntime();

    System.out.println(runtime.availableProcessors());
    System.out.println(runtime.freeMemory());
    System.out.println(runtime.totalMemory());
    System.out.println(runtime.maxMemory());

  }
}
