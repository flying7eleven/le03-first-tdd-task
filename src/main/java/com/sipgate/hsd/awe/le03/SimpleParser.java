package com.sipgate.hsd.awe.le03;

public class SimpleParser {
    int parseAndSum(final String numbers) {
        if (0 == numbers.length()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }

        throw new IllegalArgumentException("Could not deal with input values");
    }
}
