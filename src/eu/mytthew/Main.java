package eu.mytthew;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Arrays
		// EX1
//        int[] grades = {5, 5, 4, 4, 3};
//        for (int grade: grades) {
//            System.out.println(grade);
//        }

		// EX2
//        int[] grades = {5, 5, 4, 2, 3};
//        OptionalDouble average = Arrays.stream(grades).average();
//        if (average.isPresent()) {
//            System.out.println("Average value = " + average.getAsDouble());
//        }

		// EX3
//        System.out.println("Give length of array:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int[] array = new int[number];
//        for (int i = 0; i < number; i++) {
//            System.out.println("Give a number:");
//            array[i] = scanner.nextInt();
//        }
//        OptionalInt optionalMax =  Arrays.stream(array).max();
//        if (optionalMax.isPresent()) {
//            System.out.println("Highest = " + optionalMax.getAsInt());
//        }
//        OptionalInt optionalMin =  Arrays.stream(array).min();
//        if (optionalMin.isPresent()) {
//            System.out.println("Lowest = " + optionalMin.getAsInt());
//        }

		// EX4
//        String[] names = {"Adam", "Bart", "Charlie", "Derek", "Elizabeth"};
//        int[] age = {30, 25, 19, 41, 65};
//        for (int i = 0; i < age.length; i++) {
//	        System.out.println(names[i] + " has " + age[i] + " years old.");
//        }

		// EX5
//		Random random = new Random();
//		int[] grades = new int[30];
//		for (int i = 0; i < grades.length; i++) {
//			grades[i] = random.nextInt(6 - 2) + 2;
//			System.out.println("Student with index number " + i + " receive grade: " + grades[i]);
//		}


		// Lists
		// EX1
//		List<String> users = new ArrayList<>();
//		users.add("Mytthew");
//		users.add("Kryspy");
//		users.add("Tomx");
//		users.add("Adamx");
//		System.out.println("Type user nickname: ");
//		Scanner scanner = new Scanner(System.in);
//		String givenUser = scanner.nextLine();
//		if (users.contains(givenUser)) {
//			System.out.println("List contains user with nickname \"" + givenUser + "\".");
//		} else {
//			System.out.println("List does not contain user with given nickname.");
//		}
		// EX2
//		List<Integer> listOne = new ArrayList<>();
//		List<Integer> listTwo = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			listOne.add(i);
//			listTwo.add(i + 5);
//		}
//		for (int x : listTwo) {
//			if (!listOne.contains(x)) {
//				listOne.add(x);
//			}
//		}
//		System.out.println(listOne);
//		System.out.println(listTwo);
	}
}
