package com.company;

public class Main {

    public static void main(String[] args) {
        for(int k = 0; k<2; k++) {
            System.out.println("||\n||     |?|");

            for(int i = 0; i<2; i++) {
                System.out.println("||");
            }
            System.out.println("||     |?|\n||");
            System.out.println("");
        }
        for(int i = 0; i<6; i++) {
            for(int j = 0; j <i; j++){
                System.out.print("||");
            }
            System.out.println("");

        }
        System.out.println("||\n||");
        System.out.print("|");
        for(int i = 0; i<1; i++) {

            for(int j = 0; j<15; j++) {

                System.out.print("-");

            }
        }



    }
    public static void printBoardPart1 ()	{
        for(int i = 0; i<6; i++) {
            System.out.println("||");
        }

        System.out.println("");
    }

    }

