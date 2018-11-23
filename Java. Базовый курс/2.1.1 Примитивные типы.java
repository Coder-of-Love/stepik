/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.
*/

//мое
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return 
        (a & b & !c & !d) 
        ||
        (a & !b & c & !d) 
        ||
        (!a & b & c & !d) 
        ||
        (a & !b & !c & d) 
        ||
        (!a & b & !c & d) 
        ||
        (!a & !b & c & d) 
        ;
}

//чужое, через ТИ
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a != b) && (c != d)) || ((a != c) && (b != d));
}

//чужое, через сумму истинностей
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a?1:0) + (b?1:0) + (c?1:0) + (d?1:0)) == 2;
}

//чужое, через побитовые операторы
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a ^ b) & (c ^ d)) | ((a ^ c) & (d ^ b));
}

//чужое
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
}