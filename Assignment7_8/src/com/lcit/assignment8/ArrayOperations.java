package com.lcit.assignment8;

import java.util.Random;

public class ArrayOperations {
	
	public static double average(int[] array) {
		return (double) sumOfElements(array) / array.length; // Uses sumOfElement method that was created for this class.
	}
	
	public static int[] reversedArray(int[] array) {
		// Creates a new array with the same length and then each item is assigned in the reversed order than the original one. Then this array is returned.
		int[] reversedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - i - 1];
		}
		return reversedArray;
	}
	
	public static void displayArray(int[] array) {
		String output = "[ ";
		
		for (int i = 0; i < array.length; i++) {
			output += String.format("%2d", array[i]);
			output += (array.length - 1 != i) ? ", " : " ]" ; // Select the connector, in case is the last item prints "]", otherwise just a ",".
		}
		System.out.println(output); // Prints the String.
	}
	
	public static void displayElements(int[] array) {
		for (int item : array) {
			System.out.println(item); // print one item by one.
		}
	}
	
	public static int maxValue(int[] array) {
		int max = array[0];
		// Evaluate each one of the items, in case of being more than the max value, max value is now that value.
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; 
			}
		}		
		return max;
	}
	
	public static int minValue(int[] array) {
		int min = array[0];
		// Evaluate each one of the items, in case of being less than the min value, min value is now that value.
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}		
		return min;
	}
	
	public static int sumOfElements(int[] array) {
		int sum = 0;
		// Creates a sum variable and goes item by item adding it to it.
		for (int item : array) {
			sum += item;
		}		
		return sum;
	}
	
	
	public static void populateArray(int[] array) {
		Random randomNumber = new Random();
		// Randomly fills the array with integer numbers form 1 - 100.
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt(101);
		}
	}

}
