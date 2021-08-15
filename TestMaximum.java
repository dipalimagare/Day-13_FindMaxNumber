package com.bl;

import java.util.Scanner;

public class TestMaximum {
	Scanner sc = new Scanner(System.in);

	public Integer getMaxNumber(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if (num2.compareTo(max) > 0)
			max = num2;
		else if (num3.compareTo(max) > 0)
			max = num3;

		return max;
	}

	public Double getMaxNumber(Double num1, Double num2, Double num3) {
		Double max = num1;
		if (num2.compareTo(max) > 0)
			max = num2;
		else if (num3.compareTo(max) > 0)
			max = num3;

		return max;
	}

	public String getMaxStr(String num1, String num2, String num3) {
		String max = num1;
		if (max.compareTo(num2) > max.length())
			max = num2;
		if (max.compareTo(num3) > max.length())
			max = num3;
		System.out.println("====>" + max);
		return max;
	}
}
