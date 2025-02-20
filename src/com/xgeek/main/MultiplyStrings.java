package com.xgeek.main;

/**
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStrings {

	public static void main(String[] args) {
		MultiplyStrings obj= new MultiplyStrings();
		String num1 = "123";
        String num2 = "456";
		System.out.println(obj.multiply(num1, num2));

	}

	public String multiply(String num1, String num2) {
		if (num1.length() < 1 || num2.length() > 200)
			return "";
		int[] result = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				System.out.println(mul);
				int sum = mul + result[i + j + 1];
				result[i + j] += sum / 10;
				result[i + j + 1] = sum % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int num : result) {
			if (!(sb.length() == 0 && num == 0)) {
				sb.append(num);
			}
		}

		return sb.length() == 0 ? "0" : sb.toString();

		/*
		 * long a=0,b=0; for(int i=0; i< num1.length(); i++){ a = a * 10 +
		 * num1.charAt(i)-'0'; }
		 * 
		 * for(int i=0; i< num2.length(); i++){ b = b * 10 + num2.charAt(i)-'0'; }
		 * System.out.println(b); return ""+ multiply(a,b);
		 */
	}

	public long multiply(long a, long b) {
		return a * b;
	}

}
