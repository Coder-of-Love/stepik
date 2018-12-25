–еализуйте метод, провер€ющий, €вл€етс€ ли заданное число по абсолютной величине степенью двойки.
/*
–ешать можно разными способами:

-воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
-применив пару трюков из двоичной арифметики;
-написав решение "в лоб" с циклом и условными операторами (можете вернутьс€ к этой задаче после  просмотра соответствующих уроков).

¬оспользуйтесь предоставленным шаблоном. ƒекларацию класса, метод main и обработку ввода-вывода добавит провер€юща€ система.

Sample Input 1:
0
Sample Output 1:
false

Sample Input 2:
1
Sample Output 2:
true

Sample Input 3:
-2
Sample Output 3:
true
*/

//мое
public static boolean isPowerOfTwo(int value) {
    int pos, neg;
    
    if (value >= 0) {
        pos = value;
        neg = -value;
    }
    else {
        pos = -value;
        neg = value;
    }
    
    boolean b = (((pos & neg) == pos) && (pos != 0));
    
    return b;
}

//чужое
public static boolean isPowerOfTwo(int value) {
    return Integer.bitCount(Math.abs(value)) == 1; // you implementation here
}

//чужое
public static boolean isPowerOfTwo(int value) {
    value = Math.abs(value);
    
    return ((value & (value - 1)) == 0) & (0 != value);// you implementation here
}