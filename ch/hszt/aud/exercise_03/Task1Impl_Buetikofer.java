package ch.hszt.aud.exercise_03;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 10.10.12
 * Time: 09:47
 */
public class Task1Impl_Buetikofer implements Task1 {

    public Task1Impl_Buetikofer() {
    }

    @Override
    public int[][] convert2DMatrix(int[] matrixArray, int rowCount, int colCount, StorageOrder storageOrder) throws NullPointerException, IllegalArgumentException {
        int[][] newArray;

        if(storageOrder == storageOrder.ROW_MAJOR_ORDER) {
            newArray = new int[rowCount][colCount];
            int h = 0;
            for(int i = 0; i < rowCount; i++) {
                for(int j = 0; j < colCount; j++) {
                    newArray[i][j] = matrixArray[h];
                    h++;
                }
            }
        } else {
            newArray = new int[colCount][rowCount];
            int h = 0;
            for(int i = 0; i < colCount; i++) {
                for(int j = 0; j < rowCount; j++) {
                    newArray[i][j] = matrixArray[h];
                    h++;
                }
            }
        }

        return newArray;
    }
}
