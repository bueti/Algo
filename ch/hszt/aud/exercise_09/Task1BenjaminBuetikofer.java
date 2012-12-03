package ch.hszt.aud.exercise_09;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 03.12.12
 * Time: 11:20
 */
public class Task1BenjaminBuetikofer {


    public static void main(String[] args) {
        int[] array = { 1, 10, 60, 30, 90, 20, 2, 100, 4, 18, 20, 110 };
        int first = 0;
        int last = array.length-1;

        Task1BenjaminBuetikofer.quickSort(array, first, last);

        System.out.println("Aufsteigen: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void quickSort(int[] array, int first, int last) {
        int x,i,j;

        if (first < last) {
            // Divide
            x = array[(first + last) / 2];
            i = first;
            j = last;

            do {
                while (array[i] < x) {
                    i++;
                }

                while (x < array[j]) {
                    j--;
                }

                if (i <= j) {
                    // Swap
                    if (i != j) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }

                    i++;
                    j--;
                }
            } while ( j > i);

            // Conquer
            quickSort(array, first, j);
            quickSort(array, i, last);

        }
    }
}
