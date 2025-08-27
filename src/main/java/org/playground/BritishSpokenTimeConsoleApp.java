package org.playground;

import org.playground.exceptions.InvalidTimeFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class BritishSpokenTimeConsoleApp {

    private static final Logger logger = LoggerFactory.getLogger(BritishSpokenTimeConsoleApp.class);


    public static void main(String[] args) {
        BritishSpokenTimeFormatter timeFormatter = new BritishSpokenTimeFormatter();
        Scanner scanner = new Scanner(System.in);

        logger.info("==== British Spoken Time Converter ====");
        logger.info("Enter a time in HH:mm format. Type 'exit' to quit.");

        while (true) {
            logger.info("Enter time: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                // Just prompt again instead of crashing/exiting
                logger.error("No input entered. Please try again.");
                continue;
            }

            if (input.equals("exit")) {
                logger.info("==== END ====");
                break;
            }

            try {
                String britishSpokenTime = timeFormatter.toBritishSpokenTime(input);
                logger.info("British spoken time is: " + britishSpokenTime);
            } catch (InvalidTimeFormatException e) {
                logger.error(e.getMessage());
            }
        }
        scanner.close();
    }
}