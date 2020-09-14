package praktika5;

/**
 * ���� ���������� ������������������, � ������� ������ ����������� ����� k ����������� ����� k ���: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, ...
 * �� ������� ������������ n �������� ������ n ������ ���� ������������������.
 * ���������� �������� ������ ����� ������ for.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        for (int i = 1; i < 79; i++) {
            System.out.print(i + ") ");
            System.out.println(triangleSequence(i));
        }
    }

    private static String triangleSequence(int n) {
        if (n < 1) {
            throw new IllegalStateException("����� �� ����� ���� ������ 1.");
        }
        if (n == 1) {
            return String.valueOf(n);
        }
        int nextDigit = 0;
        int numOfPrintedDigits = 0;
        for (int i = 1; numOfPrintedDigits < n; i++) {
            nextDigit = i;
            numOfPrintedDigits += i;
        }
        System.out.format("%s %d", triangleSequence(--n), nextDigit);
        return "";
    }
}