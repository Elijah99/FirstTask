package com.epam.task.first.parsing;

import com.epam.task.first.data.DataException;
import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private final String DATA_INVALID = "1e 24 -4 h";
    private final String DATA_VALID = "1 24 -4 1123 -5656   ";
    private final String DATA_EMPTY = "";


    @Test
    public void testValidateStringArrayShouldReturnFalseWhenDataInvalid() throws DataException {
        //given
        ArrayValidator validator = new ArrayValidator();
        //when
        boolean result = validator.validateStringArray(DATA_INVALID);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testValidateStringArrayShouldReturnTrueWhenDataValid() throws DataException {
        //given
        ArrayValidator validator = new ArrayValidator();
        //when
        boolean result = validator.validateStringArray(DATA_VALID);
        //then
        Assert.assertTrue(result);
    }

    @Test(expected = DataException.class)
    public void testValidateStringArrayShouldReturnTrueWhenData() throws DataException {
        //given
        ArrayValidator validator = new ArrayValidator();
        //when
        validator.validateStringArray(DATA_EMPTY);
        //then
    }

}

