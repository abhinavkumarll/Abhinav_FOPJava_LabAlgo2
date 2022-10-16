package com.gl.lab2.algorithms;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Denominations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the name of Currency ?");
		String name = sc.next();
		System.out.println("Size of Denominations for " + name + ":");
		int num = sc.nextInt();

		// int arr[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
		System.out.println("Enter Denomination values:");
		Integer arr[] = new Integer[num];
		for (int i = 0; i < num; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.print("Enter amount to be paid in " + name + ":");
		int totalAmount = sc.nextInt();

		// Calling findNote()
		findNote(totalAmount, arr, num, name);
	}

	// findNote() method to find Denominations
	public static void findNote(int totalAmount, Integer[] arr, int num, String name) {
		int temp = totalAmount;
		for (int i = 0; i < num; i++) {
			if (temp / arr[i] != 0) {
				System.out.println(arr[i] + " " + name + " denomination required:" + temp / arr[i]);
				// System.out.println(arr[i] + ":" + temp / arr[i]);
				temp = temp % arr[i];
			}
		}
		if(temp != 0)
			System.out.println(name +" left unaccounted:" +temp);
		
	}
}
