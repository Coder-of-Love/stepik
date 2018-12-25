/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1⋅2⋅...⋅N.
Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит.
Поэтому будем использовать BigInteger.
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Sample Input 1:
1
Sample Output 1:
1

Sample Input 2:
3
Sample Output 2:
6
*/

//мое
static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE;

        for (int i = 2; i <= value; i++)
            res = res.multiply(BigInteger.valueOf(i));

        return res;
}

//чужое, через рекурсию
public static BigInteger factorial(int value) {
  return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial (value-1));
}
