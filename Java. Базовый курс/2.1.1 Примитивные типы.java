/*
���������� �����, ������������ true, ���� ����� ������� ��� ���������� ����� ��� ������� (�����). �� ���� ��������� ������� ����� ������ ���������� false.
*/

//���
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

//�����, ����� ��
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a != b) && (c != d)) || ((a != c) && (b != d));
}

//�����, ����� ����� �����������
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a?1:0) + (b?1:0) + (c?1:0) + (d?1:0)) == 2;
}

//�����, ����� ��������� ���������
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a ^ b) & (c ^ d)) | ((a ^ c) & (d ^ b));
}

//�����
public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return (a | b | c | d) && !(a & b & c & d) && !(a ^ b ^ c ^ d);
}