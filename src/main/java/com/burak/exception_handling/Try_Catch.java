package com.burak.exception_handling;

public class Try_Catch {
    public static void main(String[] args) {

        /*int a = 42 / 0; //unchecked exception
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[6]);
        System.out.println("Is it working ?");*/

        try {
            int a = 42/0;
        } catch (Exception e) {
            System.out.println("Error...");
            e.printStackTrace();
        }
        System.out.println("Program still working...");

        System.out.println("----------------");

        try {
            int[] ar = {1,2,3,4,5};
            System.out.println(ar[6]);
            int b = 11/0;

        } catch (ArithmeticException e) {
            System.out.println("You can't divide a integer by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You passed the length of the array");
        } catch (Exception e) {
            System.out.println("Error...!!..!!");
        }
    }
}
