package by.njunko.test.main;

import by.njunko.test.model.Segment;
import by.njunko.test.service.TaskService;
import by.njunko.test.service.impl.TaskServiceImpl;
import by.njunko.test.util.CustomScanner;
import by.njunko.test.util.Printer;

public class Main {

	private static final String ENTER_PRIME_MESSAGE = "Enter value for prime numbers: ";
	private static final String ENTER_FIBONACCI_MESSAGE = "Enter value for  fibonacci numbers: ";
	private static final String ENTER_SEGMENT_MESSAGE = "Enter segment: ";
	private static final String ENTER_VALUE_MESSAGE = "Enter value: ";
	private static final String PRIME_NUMBER_TITLE = "Prime numbers: ";
	private static final String FIBONACCI_NUMBER_TITLE = "Fibonacci numbers: ";
	private static final String IS_INTERSECTION_SEGMENTS_TITLE = "Is intersection segments: ";
	private static final String GDC_TITLE = "GDC: ";
	private static final String LCM_TITLE = "LCM: ";
	private static final String IS_PALINDROME_TITLE = "Is palindrome: ";
	private static final String TEXT_WITHOUT_NUMBERS_TITLE = "Text without numbers: ";

	public static void main(String[] args) {
		TaskService taskService = new TaskServiceImpl();
		Printer printer = new Printer();
		CustomScanner scanner = new CustomScanner();
		
		
		printer.print(ENTER_PRIME_MESSAGE);
		Integer primeNumber = scanner.enterInteger();
		printer.print(PRIME_NUMBER_TITLE, taskService.calculatePrimeNumber(primeNumber));
		
		printer.print(ENTER_FIBONACCI_MESSAGE);
		Integer fibonacciNumber = scanner.enterInteger();
		printer.print(FIBONACCI_NUMBER_TITLE, taskService.calculateFibonacciNumber(fibonacciNumber));
		
		printer.print(ENTER_SEGMENT_MESSAGE + "\n");
		Segment segment1 = scanner.enterSegment();
		printer.print(ENTER_SEGMENT_MESSAGE + "\n");
		Segment segment2 = scanner.enterSegment();
		printer.print(IS_INTERSECTION_SEGMENTS_TITLE, taskService.isIntersectionSegments(segment1, segment2));
		
		printer.print(ENTER_VALUE_MESSAGE);
		Integer gdcA = scanner.enterInteger();
		printer.print(ENTER_VALUE_MESSAGE);
		Integer gdcB = scanner.enterInteger();
		printer.print(GDC_TITLE, taskService.calculateRecursiveGCD(gdcA, gdcB));
		
		printer.print(ENTER_VALUE_MESSAGE);
		Integer lcmA = scanner.enterInteger();
		printer.print(ENTER_VALUE_MESSAGE);
		Integer lcmB = scanner.enterInteger();
		printer.print(LCM_TITLE, taskService.calculateRecursiveLCM(lcmA, lcmB));
		
		printer.print(ENTER_VALUE_MESSAGE);
		String text1 = scanner.enterText();
		printer.print(IS_PALINDROME_TITLE, taskService.isPalindrome(text1));
		
		printer.print(ENTER_VALUE_MESSAGE);
		String text2 = scanner.enterText();
		printer.print(TEXT_WITHOUT_NUMBERS_TITLE, taskService.deleteNumberFromText(text2));
	}
}
