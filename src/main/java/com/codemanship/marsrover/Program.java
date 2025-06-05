package com.codemanship.marsrover;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to the Mars Rover!");
        System.out.println("Enter target coordinates and direction: ");

        if (sc.hasNext()) {
            String userInput = sc.nextLine();

            Rover rover = new Rover(userInput);
            System.out.println(rover.getInitialState());
        }

        while (sc.hasNext()) {
            String userInput = sc.nextLine();
            System.out.println("Entered: " + userInput);
        }
    }
}
