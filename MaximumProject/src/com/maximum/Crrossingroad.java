package com.maximum;

import java.util.ArrayList;
import java.util.Scanner;

public class Crrossingroad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to enter :- \n ");
		int num = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter " + num + " Numbers Only 0 or 1 : -");
		int count = 1;
		while (true && count <= num) {
			int input;
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input == 0 || input == 1) {
					count++;
					al.add(input);
				} else {
					System.out.println("Only 0 or 1 accept-> \n ");
					input = sc.nextInt();
					count++;
					al.add(input);
				}
			} else {
				System.out.println("That is not a number");
				sc.next();
			}
		}

		int countPair = getPairs(al);
		System.out.println("The count of crossing peoples is " + countPair);
	}

	private static int getPairs(ArrayList<Integer> al) {
		int countPair = 0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == 0) {
				for (int j = i + 1; j < al.size(); j++) {
					if (al.get(j) == 1) {
						countPair++;
					}

				}
			}
		}
		if(countPair > 1000000000) {
			return -1;
		}
		return countPair;
	}
}
