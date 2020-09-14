package praktika5;

/**
 * ���� ����������� ����� n. �������� ��� ����� �� 1 �� n.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            next(i);
            System.out.println();
        }
    }

    private static void next(int n) {
        if (n < 1) {
            throw new IllegalStateException("����� �� ����� ���� ������ 1.");
        }
        if (n > 1) {
            next(n - 1);
        }
        System.out.print(n + " ");
    }
}