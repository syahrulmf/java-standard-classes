package classes;

import java.util.Arrays;

public class ArraysClass {
  public static void main(String[] args) {

    /**
     *
     * Arrays class adalah class yang berisikan static method yang bisa kita gunakan untuk memanipuasi data array
     * seperti pencarian dan pengurutan
     *
     * Method di Arrays Class
     * [1] binarySearch(array, value) -> Mencari value di array menggunakan binary search algorithm
     * [2] copyOf(...) -> Menyalin data array
     * [3] equals(array1, array2) -> Membandingkan array1 dan array2
     * [4] sort(array) -> Mengurutkan array
     * [5] toString(array) -> Mengembalikan representasi string
     * ...dan masih banyak lagi
     *
     */

    int[] numbers = {
            1,4,5,767,123,23,3,111,5,234,3,4,9
    };

    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    System.out.println(Arrays.binarySearch(numbers, 7));
    System.out.println(Arrays.binarySearch(numbers, 234));
    System.out.println(Arrays.binarySearch(numbers, 100));

    int[] result =  Arrays.copyOf(numbers, 5);
    System.out.println(Arrays.toString(result));

    int[] result2 =  Arrays.copyOfRange(numbers, 5, 10);
    System.out.println(Arrays.toString(result2));

  }
}
