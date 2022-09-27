package com.burak.generics.miniproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Find the student who came first in the exam");
		Scanner scan = new Scanner(System.in);
		String operations = "----Operations----\n" +
				"1-Numerical Student\n" +
				"2-Physical Student\n" +
				"Exit- 'q' ";
		System.out.println(operations);

		while (true) {

			System.out.println("Enter first student name");
			String name1= scan.nextLine();
			System.out.println("Enter scores (Math,Physcs,Chem,Geo)");
			int mat1 = scan.nextInt();
			int phy1 = scan.nextInt();
			int che1 = scan.nextInt();
			int geo1 = scan.nextInt();
			scan.nextLine();

			System.out.println("Enter second student name");
			String name2= scan.nextLine();
			System.out.println("Enter scores (Math,Physcs,Chem,Geo)");
			int mat2 = scan.nextInt();
			int phy2 = scan.nextInt();
			int che2 = scan.nextInt();
			int geo2 = scan.nextInt();
			scan.nextLine();

			System.out.println("Enter third student name");
			String name3= scan.nextLine();
			System.out.println("Enter scores (Math,Physcs,Chem,Geo)");
			int mat3 = scan.nextInt();
			int phy3 = scan.nextInt();
			int che3 = scan.nextInt();
			int geo3 = scan.nextInt();
			scan.nextLine();


			System.out.println("Enter operation");
			String op = scan.nextLine();

			if (op.equals("q")){
				System.out.println("Program Finished ");
				break;
			} else if (op.equals("1")) {
				Numerical c1 = new Numerical(mat1, phy1, che1, geo1, name1);
				Numerical c2 = new Numerical(mat2, phy2, che2, geo2, name2);
				Numerical c3 = new Numerical(mat3, phy3, che3, geo3, name3);

				Numerical first = compare(c1, c2, c3);
				System.out.println("First candidate is " + first.getName());
				System.out.println("The score is " + first.calculate_score());
				
			} else if (op.equals("2")) {
				Physical c1 = new Physical(mat1, phy1, che1, geo1, name1);
				Physical c2 = new Physical(mat2, phy2, che2, geo2, name2);
				Physical c3 = new Physical(mat3, phy3, che3, geo3, name3);

				Physical first = compare(c1, c2, c3);
				System.out.println("First candidate is " + first.getName());
				System.out.println("The score is " + first.calculate_score());


			} else {
				System.out.println("Invalid operation");
			}
		}

	}
	
	public static <E extends Candidate> E compare(E e1, E e2, E e3) {
		if(e1.calculate_score() > e2.calculate_score() && e1.calculate_score() > e3.calculate_score()) {
			return e1;
		}
		else if(e2.calculate_score() > e1.calculate_score() && e2.calculate_score() > e3.calculate_score()) {
			return e2;
		}
		else if(e3.calculate_score() > e1.calculate_score() && e3.calculate_score() > e2.calculate_score()) {
			return e2;
		}

		else {
			return e1;
		}
	}

}
