package org.example;

import java.util.ArrayList;
import java.util.List;

public class Resources {

    public String presentValue(int number, int selection) {

        if (selection == 4 && number == 0)
            throw new NullPointerException("No value for Roman zero");

        return switch (selection) {
            case 1 -> radix10.get(number);
            case 2 -> radix4.get(number);
            case 3 -> radixBinary.get(number);
            case 4 -> radixRome.get(number);
            default -> null;
        };
    }

        List<String> radix10 = new ArrayList<>(List.of(
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15"
        ));

    List<String> radix4 = new ArrayList<>(List.of(
            "0",
            "1",
            "2",
            "3",
            "10",
            "11",
            "12",
            "13",
            "100",
            "101",
            "102",
            "103",
            "110",
            "111",
            "112",
            "113"
    ));
    List<String> radixBinary = new ArrayList<>(List.of(
            "0",
            "1",
            "10",
            "11",
            "100",
            "101",
            "110",
            "111",
            "1000",
            "1001",
            "1010",
            "1011",
            "1100",
            "1101",
            "1110",
            "1111"
    ));
    List<String> radixRome = new ArrayList<>(List.of(
            "-",
            "I",
            "II",
            "III",
            "IV",
            "V",
            "VI",
            "VII",
            "VIII",
            "IX",
            "X",
            "XI",
            "XII",
            "XIII",
            "XIV",
            "XV"
    ));


    }
