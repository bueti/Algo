package ch.hszt.aud.exercise_09;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 03.12.12
 * Time: 12:35
 */
public class Task2BenjaminBuetikofer {

    public static void main(String[] args) {
        int[] array = { 4, 3, 8, 2, 5, 9, 1, 7, 6, 0 };
        int first = 0;
        int last = array.length-1;

        Task2BenjaminBuetikofer.shellSort(array, first, last);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void shellSort(int[] array, int first, int last) {
        int i, j, n, h, e;

        n = last - first + 1;
        h = n / 2;

        while (h > 0) {
            for ( i = first; i <= last - h; i++) {
                e = array[i + h];
                j = i;

                while (j >= first && e < array[j]) {
                    array[j+h] = array[j];
                    j = j - h;
                }
                array[j + h] = e;
            }
            h = h/2;

        }
    }
}
