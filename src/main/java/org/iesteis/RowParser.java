package org.iesteis;

import java.util.List;

public class RowParser {

    private static final int PENCE_PER_SHILLING = 12;
    private static final int SHILLINGS_PER_POUND = 20;
    private static final int PENCE_PER_POUND =
            PENCE_PER_SHILLING * SHILLINGS_PER_POUND;

    private RowParser() {
    }

    public static Row rowParser(String row) {
        List<String> cleanRow = List.of(row.trim().split("\\s+"));

        if (cleanRow.size() != 4) {
            throw new IllegalArgumentException(
                    "La fila debe contener 4 valores");
        }

        int firstValue = Integer.parseInt(cleanRow.get(0));
        int secondValue = Integer.parseInt(cleanRow.get(1));
        int thirdValue = Integer.parseInt(cleanRow.get(2));
        int fourthValue = Integer.parseInt(cleanRow.get(3));

        int totalPence =
                firstValue * 12
                + secondValue * 9
                + thirdValue * 18
                + fourthValue * 12;

        int pounds = totalPence / PENCE_PER_POUND;
        int remainingPence = totalPence % PENCE_PER_POUND;

        int shillings = remainingPence / PENCE_PER_SHILLING;
        int pence = remainingPence % PENCE_PER_SHILLING;

        return new Row(pounds, shillings, pence);
    }
}
