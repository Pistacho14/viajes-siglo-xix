package org.iesteis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    
    @Test
    public void shouldPrintConvertedRows()
    {
        String input = "6\r\n" + //
                        "1 0 0 0\r\n" + //
                        "0 1 0 0\r\n" + //
                        "0 0 1 0\r\n" + //
                        "0 0 0 1\r\n" + //
                        "1 1 1 1\r\n" + //
                        "10 10 10 10";
        
        String expectedOutput = String.join(System.lineSeparator(),
                        "0 1 0",
                        "0 0 9",
                        "0 1 6",
                        "0 1 0",
                        "0 4 3",
                        "2 2 6")
                + System.lineSeparator();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));
            App.main(new String[] { input });
        } finally {
            System.setOut(originalOutput);
        }

        assertEquals(expectedOutput, output.toString());
    }
}
