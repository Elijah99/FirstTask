package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;


public class ArrayParserTest {

    private final String DATA_POSITIVE = "1 2 3 44";
    private final String DATA_NEGATIVE = "-1 22 -4568 45444 0";


    @Test
    public void testParseArrayFromStringShouldParseArrayFromStringWhenPositiveNumbersApplied() {
        //given
        ArrayParser arrayParser = new ArrayParser();
        //when
        Array actualArray = arrayParser.parseArrayFromString(DATA_POSITIVE);
        Array expectedArray = new Array(1, 2, 3, 44);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testParseArrayFromStringShouldParseArrayFromStringWhenNegativeNumbersApplied() {
        //given
        ArrayParser arrayParser = new ArrayParser();
        //when
        Array actualArray = arrayParser.parseArrayFromString(DATA_NEGATIVE);
        Array expectedArray = new Array(-1, 22, -4568, 0, 45444);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

}
