package org.playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class BritishSpokenTimeConsoleAppTest {

  @Test
  public void testConsoleAppEndToEnd() {
    // Simulate user typing "6:32" then "exit"
    String simulatedInput = "6:32\nexit\n";
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    // Capture console output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Run the app
    BritishSpokenTimeConsoleApp.main(new String[] {});

    String output = outputStream.toString();

    // Assertions
    assertTrue(output.contains("six thirty two"));
    assertTrue(output.contains("==== END ===="));
  }
}
