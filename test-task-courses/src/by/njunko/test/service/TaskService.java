package by.njunko.test.service;

import java.util.List;

import by.njunko.test.model.Segment;

public interface TaskService {

	List<Integer> calculatePrimeNumber(Integer lastNumber);

	List<Integer> calculateFibonacciNumber(Integer lastNumber);

	boolean isIntersectionSegments(Segment segmentOne, Segment segmentTwo);

	Integer calculateRecursiveGCD(Integer numberOne, Integer numberTwo);

	Integer calculateRecursiveLCM(Integer numberOne, Integer numberTwo);

	boolean isPalindrome(String text);

	String deleteNumberFromText(String text);
}
