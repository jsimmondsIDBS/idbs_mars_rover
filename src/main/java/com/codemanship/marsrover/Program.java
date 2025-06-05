package com.codemanship.marsrover;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rover rover;

        System.out.println("Welcome to the Mars Rover!");
        System.out.println("Enter target coordinates and direction: ");

        if (sc.hasNext()) {
            String userInput = sc.nextLine();

            rover = new Rover(userInput);
            System.out.println(rover.getInitialState());

            while (sc.hasNext()) {
                userInput = sc.nextLine();

                if (userInput.equals("Q")) {
                    System.out.println(rover.getCurrentState());
                }

                if (userInput.equals("R")) {
                    rover.turn("R");
                }
                if (userInput.equals("X")) {
                    System.exit(0);
                }
            }
        }


    }
}
