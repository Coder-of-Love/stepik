/*
���������� �����, ������� ���������� �����, ������� � ������� UNICODE ����� ������� "\" (�������� ����) �� ���������� a.

� �������� ������� �������� �������� ������������ ���������. ��������� ���.

Sample Input 1:
32
Sample Output 1:
|

Sample Input 2:
29
Sample Output 2:
y
*/

//���
public static char charExpression(int a) {
    return (char) ((int) '\\' + a) ;
}