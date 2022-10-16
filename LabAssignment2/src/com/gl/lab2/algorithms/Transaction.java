package com.gl.lab2.algorithms;

import java.util.Scanner;

class Transaction {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Transactions");
		int transactions = sc.nextInt();
		
		int arr[] = new int[transactions];
		System.out.println("Enter the values of Transactions");
		for (int i = 0; i < transactions; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("How many targets are to be acheived ?");
		int totaltargets = sc.nextInt();
		while (totaltargets-- != 0) {
			int flag = 0;
			System.out.println("What is the value of Target?");
			long target = sc.nextInt();
			
			long total = 0;
			for (int i = 0; i < transactions; i++) {
				total += arr[i];
				if (total >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					System.out.println("Target was: " + target);
					for (int j=0; j < transactions; j++) {
						System.out.println("Transaction made is: " + arr[j]);
						}
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Target is not achieved");
				for (int i=0; i < transactions; i++) {
				System.out.println("Transaction made is: " + arr[i]);
				}
			}
		}
		System.out.println("Thanks !");
	}
}