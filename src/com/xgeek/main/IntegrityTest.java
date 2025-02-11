package com.xgeek.main;

public class IntegrityTest {

	public static void main(String[] args) {
		Integer[] input = { 0, 8, 7, 6, 5, -3 };
		IntegrityTest integrityTest = new IntegrityTest();
		int output = integrityTest.calculateIndex(input);
		System.out.println(output);
	}

	public int calculateIndex(Integer[] input) {
		int length = input.length;
		if (length > -1) {
			for (int i = 0; i < length; i++) {
				int firstPrev = 0;
				int secondPrevinput = 0;
				if (i > 1) {
					firstPrev = input[i - 1];
					secondPrevinput = input[i - 2];
				}
				int sum_left = firstPrev + secondPrevinput;
				int sum_right = 0;
				for (int x = i + 1; x < length; x++) {
					sum_right = sum_right + input[x];
				}
				// we will have some of right side
				if (sum_left == sum_right) {
					return input[i];
				}

			}
		}

		return -1;
	}

}
