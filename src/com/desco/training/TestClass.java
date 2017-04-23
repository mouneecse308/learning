package com.desco.training;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		// System.out.println(a);
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else if (b > c) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else if (c > a) {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println("concate kore kivabe?"+c);
			}
		} else
			System.out.println("Sys error");

		///////////switch/////////////////////////
		switch (a) {
		case 1:
			System.out.println("value of a = 1");
			break;
		case 2:
			System.out.println("value of a = 2");
			break;
		case 3:
			System.out.println("value of a = 3");
			break;
		case 4:
			System.out.println("value of a = 4");
			break;
		default:
			break;
		} 

	}

}
