package com.burak.generics;


public class Main {

	public static void main(String[] args) {

		Character[] char_arr = {'J','A','V','A'};
		Integer[] int_arr = {1,2,3,4,5,6,7};
		String[] string_arr= {"Java","Python","C"};
		
		Student[] student_arr= {new Student(),new Student(),new Student()};
		
		PrintChar.print(char_arr);
		PrintInteger.print(int_arr);
		PrintString.print(string_arr);
		PrintStudent.print(student_arr);
		
		System.out.println("---------------");

		
		PrintClass<Character> char_print = new PrintClass<Character>();
		PrintClass<Integer> integer_print = new PrintClass<Integer>();
		PrintClass<String> string_print = new PrintClass<String>();
		PrintClass<Student> student_print = new PrintClass<Student>();
		
		char_print.print(char_arr);
		integer_print.print(int_arr);
		string_print.print(string_arr);
		student_print.print(student_arr);
		
		System.out.println("---------------");
		
		printn(char_arr);
		printn(int_arr);
		printn(string_arr);
		printn(student_arr);

		System.out.println("---------------");

		Numerical n1 = new Numerical(90,50,40,50);
		Numerical n2 = new Numerical(80,80,60,30);
		Numerical compare = compare(n1,n2);
		System.out.println("best numerical score is: " + compare.calculate_score());
		
		System.out.println("---------------");

		Physical p1 = new Physical(100,50,80,90);
		Physical p2 = new Physical(70,60,60,70);
		Physical compare2 = compare(p1, p2);
		System.out.println("best physical score is: " + compare2.calculate_score());


	}
	
	public static <E> void printn(E[] arr){
		for(E e : arr) {
			System.out.println(e);
		}
	}
	
	public static <E extends Candidate> E compare(E e1, E e2) {
		if(e1.calculate_score() > e2.calculate_score()) {
			return e1;
		}
		else {
			return e2;
		}
	}
}
