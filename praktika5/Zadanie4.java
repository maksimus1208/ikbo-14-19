package praktika5;

import java.util.Scanner;

/**
 * �������� ����� ����
 * ���� ����������� ����� k � s. ����������, ������� ���������� k-�������
 * ����������� �����, ����� ���� ������� ����� d. ������ ������������ ����� ��
 * ����� ���������� � ����� 0.
 * � ���� ������ ����� ������������ ���� ��� �������� ���� ����, �������
 * �� �����-���� �������.
 */
public class Zadanie4 {

    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(amountOfNumbers(sc.nextInt(), sc.nextInt()));
    }

	public static int amountOfNumbers(int k, int s) {
    	return amountOfNumbers(k, s, 0, 0);
	}

    private static int amountOfNumbers(int k, int s, int length, int sum) {
    	int count = 0;

    	if (length == k && sum == s) {
    		return 1;
		} else if (length < k) {
			for (int i = (length == 0) ? 1 : 0; i < 10; i++) {
				count += amountOfNumbers(k, s, length + 1, sum + i);
			}
		} else {
    		return 0;
		}

    	return count;
	}
}