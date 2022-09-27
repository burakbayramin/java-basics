package com.burak.methods;

public class isPrime {
    public static void main(String[] args) {
        for (int i=2; i<1000; i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean prime(int a){
        for (int i =2; i<a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
