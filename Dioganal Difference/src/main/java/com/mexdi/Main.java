package com.mexdi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		int[][] arr = new int[arrLength][arrLength];
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		print2dArray(arr, arrLength);
		findDioganalsSum(arr, arrLength);
	}
	//this is function which print 2d array
	public static void print2dArray(int[][] arr, int arrLength) {
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	//this is function which sum array's dioganals
	public static void findDioganalsSum(int[][] arr, int arrLength) {
		int sumOfFirstDioganals = 0;
		int sumOfSecondDioganals = 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				if (i == j) {
					sumOfFirstDioganals += arr[i][j];
				}
				if ((arrLength - 1) - i == j) {
					sumOfSecondDioganals += arr[i][j];
				}
			}

		}
		if (sumOfFirstDioganals > sumOfSecondDioganals) {
			System.out.println(sumOfFirstDioganals - sumOfSecondDioganals);
		}
		else if (sumOfFirstDioganals < sumOfSecondDioganals) {
			System.out.println(sumOfSecondDioganals - sumOfFirstDioganals);
		}
		else{
			System.out.println(0);
		}
	}
}
