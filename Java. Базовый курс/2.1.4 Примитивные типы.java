/*
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
Данная задача актуальна, например, при работе с битовыми полями.

Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
*/

// мое
public static int flipBit(int value, int bitIndex) {
    int flipValue = (int)Math.pow(2, bitIndex - 1);
    int result = value ^ flipValue;
    return result;
}

// чужое, лучшее время выполнения
public static int flipBit(int value, int bitIndex) {
    return value ^ 1 << bitIndex - 1;
}
