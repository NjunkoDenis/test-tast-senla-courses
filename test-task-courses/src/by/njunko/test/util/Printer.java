package by.njunko.test.util;

import java.util.List;

public class Printer {

	public Printer() {

	}

	public void print(String title) {
		System.out.print(title);
	}
	
	public void print(String title, Integer value) {
		System.out.println(title + value);
	}

	public void print(String title, String value) {
		System.out.println(title + value);
	}

	public void print(String title, List<Integer> values) {
		System.out.println(title + values);
	}

	public void print(String title, boolean value) {
		System.out.println(title + (value ? "YES" : "NO"));
	}
}
