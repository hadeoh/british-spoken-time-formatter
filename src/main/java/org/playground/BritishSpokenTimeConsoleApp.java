package org.playground;

import org.playground.exceptions.InvalidTimeFormatException;

import java.util.Scanner;

public class BritishSpokenTimeConsoleApp {

    public static void main(String[] args) {
        BritishTimeFormatter timeFormatter = new BritishTimeFormatter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== British Spoken Time Converter ====");
        System.out.println("Enter a time in HH:mm format. Type 'exit' to quit.");

        while (true) {
            System.out.println("Enter time: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                // Just prompt again instead of crashing/exiting
                System.out.println("No input entered. Please try again.");
                continue;
            }

            if (input.equals("exit")) {
                System.out.println("==== END ====");
                break;
            }

            try {
                String britishSpokenTime = timeFormatter.toBritishSpokenTime(input);
                System.out.println("British spoken time is: " + britishSpokenTime);
            } catch (InvalidTimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}