package com.sipgate.hsd.awe.le03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleParserTest {
    private SimpleParser parser;

    @BeforeEach
    void beforeTest() {
        this.parser = new SimpleParser();
    }

    @Test
    @DisplayName("Parsing a single positive numerical value as a string works as intended")
    void parseAndSumWithASingleNumberWorksAsIntended() {
        final int result = parser.parseAndSum("6");
        assertEquals(6, result);
    }


    @DisplayName("An example for an parametrized test")
    @ParameterizedTest(name = "Testing that \"{0}\" equals to {1}")
    @CsvSource({
            "0,    0",
            "1,    1",
            "49,  49",
            "100,  100"
    })
    void parseAndSumWithSeveralSingleDigitValues(final String inputValue, final int expectedResult) {
        final int result = parser.parseAndSum(inputValue);
        assertEquals(expectedResult, result);
    }
}