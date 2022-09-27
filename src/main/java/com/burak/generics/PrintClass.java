package com.burak.generics;

public class PrintClass<E> {
	
	public void print(E[] arr) {
		for(E e : arr) {
			System.out.println(e);
		}
	}
}
