package org.iesteis;

import java.util.List;
import java.util.stream.Stream;


public class App 
{
    public static void main( String[] args )
    {
        
        List<String> cleanRow = args[0].lines().skip(1).toList();
        StringBuilder moneyPerRow = new StringBuilder();

        for (var row : cleanRow) {

            moneyPerRow.append(RowParser.rowParser(row).toString());
            moneyPerRow.append(System.lineSeparator());
        }

        System.out.print(moneyPerRow);
    }
}
