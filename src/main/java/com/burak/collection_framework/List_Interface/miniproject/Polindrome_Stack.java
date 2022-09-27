package com.burak.collection_framework.List_Interface.miniproject;

import java.util.Scanner;
import java.util.Stack;

public class Polindrome_Stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < word.length()/2; i++) {
            stack.push(word.charAt(i));
        }

        if (isPalindrome(word, stack)){
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is not palindrome");

        }
    }

    public static boolean isPalindrome(String w, Stack<Character> stack) {
        for (int i = (w.length() / 2) + 1; i < w.length(); i++){
            if (w.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
