package praktika5;

import java.util.Scanner;

/**
 * ���� ��� ����� ����� A � � (������ � ��������� ������).
 * �������� ��� ����� �� A �� B ������������, � ������� �����������, ���� A < B,
 * ��� � ������� �������� � ��������� ������.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fromAtoB(scanner.nextInt(), scanner.nextInt());
    }

    private static void fromAtoB(int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            fromAtoB(a - 1, b);
        } else if (a < b) {
            fromAtoB(a, b - 1);
            System.out.print(b + " ");
        } else {
            System.out.print(b + " ");
        }
    }
}