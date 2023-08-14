package classes;

import java.math.BigInteger;

public class BigNumberClass {
  public static void main(String[] args) {

    /**
     *
     * Jika kita membutuhkan menggunakan angka yang besar melebihi kapasitas Long dan Double, dapat menggunakan class berikut
     * BigInteger adalah class untuk handle tipedata Integer
     * BigDecimal adalah class untuk handle tipe data floating point
     *
     * Method di BigInteger & BigDecimal :
     * Method              Operator
     * add                    +
     * subtract               -
     * multiply               *
     * divide                 /
     * mod                    %
     * ...dan masih banyak lagi
     *
     */

    BigInteger a = new BigInteger("1000000000");
    BigInteger b = new BigInteger("5000000000");

    BigInteger result = a.add(b);

    System.out.println(result);
  }
}
