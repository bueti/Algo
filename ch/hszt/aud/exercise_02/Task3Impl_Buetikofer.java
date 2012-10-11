package ch.hszt.aud.exercise_02;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 04.10.12
 * Time: 16:12
 */
public class Task3Impl_Buetikofer implements Task3 {

    @Override
    public char[][] createDiamond(char[][] array) throws NullPointerException, IllegalArgumentException {

        int size = array.length;
        int middle = (size / 2) + 1;
        int counter = 1;
        int counter2 = middle;
        int point = middle-1;
        int y = 0;

        while(y < size) {
            if(counter < middle) {
                array[y][point] = '*';
                array[y][middle+counter-2] = '*';
                point--;
            }
            else if(counter==middle) {
                int x = 0;
                while(x<size) {
                    array[y][x] = '*';
                    x++;
                }
            }
            else {
                point++;
                counter2--;
                array[y][point] = '*';
                array[y][point+counter2+middle-3] = '*';
                middle--;
            }
            counter++;
            y++;
        }
        return array;
    }
}
