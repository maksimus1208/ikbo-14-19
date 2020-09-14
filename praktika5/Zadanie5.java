package praktika5;

import java.util.Scanner;

/**
 * ���� ����������� ����� N. ��������� ����� ��� ����.
 * ��� ������� ���� ������ ������ ������������ ������, ������, ������� (�� � �����, ����������).
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(calcAmountOfDigit(scanner.nextInt()));
    }

    private static int calcAmountOfDigit(int n) {
        if (n < 0) {
            throw new IllegalStateException("����� �� ����� ���� ������ 0.");
        }
        return (n != 0)? calcAmountOfDigit(n / 10) + (n % 10) : n;
    }
}
