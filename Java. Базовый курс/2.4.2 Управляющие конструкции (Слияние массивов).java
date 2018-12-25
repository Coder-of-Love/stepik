/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. 
Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: 
он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. 
Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. 
К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример

Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
*/

//мое
static int[] mergeArrays(int[] a1, int[] a2) {
        int reslength = a1.length + a2.length;
        int[] res = new int[reslength];

        for (int i = 0, j = 0, k = 0; k < reslength;) {
            if (i == a1.length)
                res[k++] = a2[j++];
            else if (j == a2.length)
                res[k++] = a1[i++];
            else if (a1[i] < a2[j])
                res[k++] = a1[i++];
            else
                res[k++] = a2[j++];

        }

        return res;
}

//чужое, самое популярное
public static int[] mergeArrays(int[] a1, int[] a2) {
    int n = a1.length, m = a2.length;
    int i = 0, j = 0;
    int[] array = new int[n + m];

    while (i < n || j < m)
        array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];

    return array;
}

//чужое
public static int[] mergeArrays(int[] a1, int[] a2) {
    int i = 0, j = 0;
    int[] res = new int[a1.length + a2.length];
    
    while (i < a1.length && j < a2.length)
        res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
    while (i < a1.length)
        res[i + j] = a1[i++];
    while (j < a2.length)
        res[i + j] = a2[j++];
    return res;
}
