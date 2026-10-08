package org.iesteis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RowParserTest {

    @Test
    public void parseFirstValue() {
        assertEquals("0 1 0", RowParser.rowParser("1 0 0 0").toString());
    }

    @Test
    public void parseSecondValue() {
        assertEquals("0 0 9", RowParser.rowParser("0 1 0 0").toString());
    }

    @Test
    public void parseThirdValue() {
        assertEquals("0 1 6", RowParser.rowParser("0 0 1 0").toString());
    }

    @Test
    public void parseFourthValue() {
        assertEquals("0 1 0", RowParser.rowParser("0 0 0 1").toString());
    }

    @Test
    public void parseCombinedValues() {
        assertEquals("0 4 3", RowParser.rowParser("1 1 1 1").toString());
    }

    @Test
    public void parseValuesThatConvertToPounds() {
        assertEquals("2 2 6", RowParser.rowParser("10 10 10 10").toString());
    }
}
