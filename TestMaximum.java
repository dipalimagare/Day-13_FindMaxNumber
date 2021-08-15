package com.bl;

import java.util.Scanner;

public class TestMaximum<t extends Comparable<t>> {

	public static <t extends Comparable<t>> t getMaximumNumber(t... num) {
		t max = num[0];
		String t = "";
		if (t.getClass() != max.getClass()) {
			for (t element : num) {
				if (element.compareTo(max) > 0)
					max = element;
			}
		} else {
			for (t element : num) {
				if (element.compareTo(max) > ((String) max).length())
					max = element;
			}
		}
		return max;
	}
}