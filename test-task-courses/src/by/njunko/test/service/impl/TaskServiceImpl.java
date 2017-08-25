package by.njunko.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.njunko.test.model.Segment;
import by.njunko.test.service.TaskService;

public class TaskServiceImpl implements TaskService {

	@Override
	public List<Integer> calculatePrimeNumber(Integer lastNumber) {

		List<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 2; i <= lastNumber; i++) {
			if (isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
		}

		return primeNumbers;
	}

	@Override
	public List<Integer> calculateFibonacciNumber(Integer lastNumber) {

		List<Integer> fibonacciNumbers = new ArrayList<Integer>();

		for (int i = 1; findFibonacciNumber(i) < lastNumber; i++) {
			fibonacciNumbers.add(findFibonacciNumber(i));
		}

		return fibonacciNumbers;
	}

	@Override
	public boolean isIntersectionSegments(Segment a, Segment b) {

		Double v1 = (b.getEndPoint().getX() - b.getStartPoint().getX())
				* (a.getStartPoint().getY() - b.getStartPoint().getY())
				- (b.getEndPoint().getY() - b.getStartPoint().getY())
						* (a.getStartPoint().getX() - b.getStartPoint().getX());

		Double v2 = (b.getEndPoint().getX() - b.getStartPoint().getX())
				* (a.getStartPoint().getY() - b.getStartPoint().getY())
				- (b.getEndPoint().getY() - b.getStartPoint().getY())
						* (a.getEndPoint().getX() - b.getStartPoint().getX());

		Double v3 = (a.getEndPoint().getX() - a.getStartPoint().getX())
				* (b.getStartPoint().getY() - a.getStartPoint().getY())
				- (a.getEndPoint().getY() - a.getStartPoint().getY())
						* (b.getStartPoint().getX() - a.getStartPoint().getX());
		Double v4 = (a.getEndPoint().getX() - a.getStartPoint().getX())
				* (b.getEndPoint().getY() - a.getStartPoint().getY())
				- (a.getEndPoint().getY() - a.getStartPoint().getY())
						* (b.getEndPoint().getX() - a.getStartPoint().getX());

		return v1 * v2 < 0 && v3 * v4 < 0;
	}

	@Override
	public Integer calculateRecursiveGCD(Integer numberOne, Integer numberTwo) {
		return numberTwo.equals(0) ? numberOne : calculateRecursiveGCD(numberTwo, numberOne % numberTwo);
	}

	@Override
	public Integer calculateRecursiveLCM(Integer numberOne, Integer numberTwo) {
		return numberOne / calculateRecursiveGCD(numberOne, numberTwo) * numberTwo;
	}

	@Override
	public boolean isPalindrome(String text) {
		String lowerCaseText = text.toLowerCase();
		String reverseText = new StringBuilder(lowerCaseText).reverse().toString();
		return reverseText.equals(lowerCaseText);
	}

	@Override
	public String deleteNumberFromText(String text) {
		return text.replaceAll("[0-9]", "");
	}

	private int findFibonacciNumber(int number) {
		if (number == 1) {
			return 1;
		} else if (number == 2) {
			return 1;
		} else {
			return findFibonacciNumber(number - 2) + findFibonacciNumber(number - 1);
		}
	}

	private boolean isPrimeNumber(int number) {

		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
