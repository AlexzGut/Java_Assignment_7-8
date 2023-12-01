package com.lcit.assignment8;

public class ArrayOperationsDemo {

	public static void main(String[] args) {
		
		final int SIZE_DECLARATOR = 10;
		int[] numbers = new int[SIZE_DECLARATOR];
		
		// Test each one of the tests that were created in ArrayOperation class.
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" +
						   "| This program demonstrates the methods |\n" +
						   "| in the ArrayOperations class.         |\n" +
						   "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		System.out.println("The element of the array used in this program have been randomly assigned");
		System.out.print("Array: ");
		ArrayOperations.populateArray(numbers);
		ArrayOperations.displayArray(numbers);
		System.out.println();
		
		System.out.print("Sum of all elements in the array: ");
		System.out.println(ArrayOperations.sumOfElements(numbers));
		System.out.println();
		
		System.out.print("Highest element in the array: ");
		System.out.println(ArrayOperations.maxValue(numbers));
		System.out.println();
		
		System.out.print("Lowest of all elements in the array: ");
		System.out.println(ArrayOperations.minValue(numbers));
		System.out.println();
		
		System.out.println("Elements of the array: ");
		ArrayOperations.displayElements(numbers);
		System.out.println();
		
		System.out.print("Reversed Array: ");
		ArrayOperations.displayArray(ArrayOperations.reversedArray(numbers));
		System.out.println();
		
		System.out.print("Average of the elements in the array: ");
		System.out.println(ArrayOperations.average(numbers));
	}

}
