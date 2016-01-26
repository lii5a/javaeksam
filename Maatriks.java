/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X üle laua, nagu bingo diagonaalid.
 *
 * Näide:
 *
 * x       x
 *  x     x
 *   x   x
 *    x x
 *     x
 *    x x
 *   x   x
 *  x     x
 * x       x
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {

    public static void main(String[] args) {

        int[][] iksid = new int[9][9];

        for (int i = 0; i < iksid.length ; i++) {
            System.out.println();
            for (int j = 0; j < iksid.length; j++) {
                if (j==i|| j== (iksid.length-1-i)) {
                System.out.print("x");
                    }
                else {
                    System.out.print(" ");
                }

            }

        }

    }




}
