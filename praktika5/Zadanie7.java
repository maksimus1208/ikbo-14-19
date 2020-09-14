package praktika5;

import java.util.Scanner;

/**
 * ���������� �� ���������
 * ���� ����������� ����� n>1. �������� ��� ������� ��������� �����
 * ����� � ������� �� �������� � ������ ���������. �������� ������ �����
 * ��������� O(logn)
 */
public class Zadanie7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		factorization(sc.nextInt());
	}

	public static void factorization(int x) {
		factorization(x, 2);
	}

	private static void factorization(int x, int divider) {
		if (divider > x / 2) return;

		while (x % divider > 0) divider++;
		System.out.println(divider);
		factorization(x / divider, divider);
	}
}
