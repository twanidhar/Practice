package practice1;

import java.util.Scanner;

public class ElementRemoval {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int[] intArr = { 1, 2, 5, 12, 7, 3, 8 };
		int[] newArr = null;
		System.out.print("Enter Element to be deleted : ");
		int elem = scr.nextInt();

//		for(int i = 0; i<intArr.length; i++) {
//			if (intArr[i] == elem) {
//				for (int j = i; j< intArr.length-1; j++) {
//					intArr[j] = intArr [j +1];
//				}
//				break;
//			}
//		} repeats the last number 8 

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == elem) {
				newArr = new int[intArr.length - 1];
				for (int index = 0; index < i; index++) {
					newArr[index] = intArr[index];
				}
				for (int j = i; j < intArr.length - 1; j++) {
					newArr[j] = intArr[j + 1];
				}
				break;
			}
		}
		System.out.println("Elements -- ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(" " + newArr[i]);
		}
	}
}
//successfully loops through the array and
//deletes the number from the list.

