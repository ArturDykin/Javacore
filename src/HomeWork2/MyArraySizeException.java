package HomeWork2;

public class MyArraySizeException extends RuntimeException {

    int row, column;

    public MyArraySizeException(int row, int column) {
        super("Неправильные данные, строки и столбца может быть всего 4. У вас есть: строка  " + row + ", столбец " + column);
        this.row = row;
        this.column = column;
    }
}