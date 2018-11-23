/*
Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)

Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
*/

// мое
public static boolean doubleExpression(double a, double b, double c) {
    double 
        x = a + b,
        y = c,
        e = 0.0001d,
        diff = Math.abs(x - y);
    return diff < e;
}

// чужое
public static boolean doubleExpression(double a, double b, double c) {
    return Math.abs(a + b - c)<1E-4;
}

// чужое, хитрое
public static boolean doubleExpression(double a, double b, double c) {
    return a*10000 + b*10000 == c*10000;
}

// чужое, через приведение
public static boolean doubleExpression(double a, double b, double c) {
    return (float)(a + b) == (float)c;
}

// чужое, лучшее время выполнения
public static boolean doubleExpression(double a, double b, double c) {
    return a+b>c?a+b-c<1e-4:c-a-b<1e-4;
}