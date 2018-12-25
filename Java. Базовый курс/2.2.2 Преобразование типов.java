���������� �����, �����������, �������� �� �������� ����� �� ���������� �������� �������� ������.
/*
������ ����� ������� ���������:

-���������������� ����� ������� ����������� ������� �� ������ java.lang.Integer;
-�������� ���� ������ �� �������� ����������;
-������� ������� "� ���" � ������ � ��������� ����������� (������ ��������� � ���� ������ �����  ��������� ��������������� ������).

�������������� ��������������� ��������. ���������� ������, ����� main � ��������� �����-������ ������� ����������� �������.

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

//���
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

//�����
public static boolean isPowerOfTwo(int value) {
    return Integer.bitCount(Math.abs(value)) == 1; // you implementation here
}

//�����
public static boolean isPowerOfTwo(int value) {
    value = Math.abs(value);
    
    return ((value & (value - 1)) == 0) & (0 != value);// you implementation here
}