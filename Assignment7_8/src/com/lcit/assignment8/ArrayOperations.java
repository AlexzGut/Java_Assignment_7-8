package com.lcit.assignment8;

import java.util.Random;

public class ArrayOperations {
	
	public static double average(int[] array) {
		return (double) sumOfElements(array) / array.length;
	}
	
	public static int[] reversedArray(int[] array) {
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
			output += (array.length - 1 != i) ? ", " : " ]" ;
		}
		System.out.println(output);
	}
	
	public static void displayElements(int[] array) {
		for (int item : array) {
			System.out.println(item);
		}
	}
	
	public static int maxValue(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}		
		return max;
	}
	
	public static int minValue(int[] array) {
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}		
		return min;
	}
	
	public static int sumOfElements(int[] array) {
		int sum = 0;
		
		for (int item : array) {
			sum += item;
		}		
		return sum;
	}
	
	
	public static void populateArray(int[] array) {
		Random randomNumber = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt(101);
		}
	}

}
