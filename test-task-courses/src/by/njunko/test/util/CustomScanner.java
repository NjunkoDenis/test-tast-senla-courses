package by.njunko.test.util;

import java.util.Scanner;

import by.njunko.test.model.Point;
import by.njunko.test.model.Segment;

public class CustomScanner {
	private Scanner in = new Scanner(System.in);
	private Printer printer = new Printer();

	public CustomScanner() {

	}

	public Integer enterInteger() {
		Integer value = Integer.valueOf(enterText());
		return value;
	}

	public Point enterPoint() {
		printer.print("x=");
		Double x = Double.valueOf(enterText());
		printer.print("y=");
		Double y = Double.valueOf(enterText());
		return new Point(x, y);
	}

	public Segment enterSegment() {
		Point a = enterPoint();
		Point b = enterPoint();
		return new Segment(a, b);
	}

	public Double enterDouble() {
		Double value = Double.valueOf(enterText());
		return value;
	}

	public String enterText() {
		return in.nextLine();
	}
}
