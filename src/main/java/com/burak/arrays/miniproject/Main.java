package com.burak.arrays.miniproject;

import java.util.Scanner;

public class Main {
    private static Card[][] cards = new Card[4][4];

    public static void main(String[] args) {

        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');

        while (isOver() == false){
            board();
            select();
        }
    }

    public static void board() {
        for (int i = 0; i<4; i++){
            System.out.println("--------------------");
            for (int j =0; j<4; j++){

                if (cards[i][j].isGuess()){
                    System.out.print(" |" + cards[i][j].getValue() + "| ");
                }
                else {
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------");
    }

    public static boolean isOver() {
        for (int i =0; i<4; i++){
            for (int j =0; j<4; j++){
                if(cards[i][j].isGuess() == false){
                    return false;
                }
            }
        }
        return true;
    }

    public static void select() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select your first guess position in one space as i and j -> ");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();

        cards[i1][j1].setGuess(true);
        board();

        System.out.print("Select your second guess position in one space as i and j -> ");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();

        if(cards[i1][j1].getValue() == cards[i2][j2].getValue()){
            cards[i2][j2].setGuess(true);
        }
        else {
            cards[i1][j1].setGuess(false);
        }

    }
}



