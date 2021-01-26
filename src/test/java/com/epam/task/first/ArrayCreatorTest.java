package com.epam.task.first;

import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayCreatorTest {
    private final List<Array> expectedArrayList =
            Arrays.asList(new Array(1, 2, 3), new Array(4, 5, 6, 7));

    @Test
    public void testCreateArrayListShouldReadFromFileAndValidateAndReturnResultingArrayList() {
        //given
        ArrayCreator creator = new ArrayCreator(new DataReader(), new ArrayParser(), new ArrayValidator());
        //when
        List<Array> actualArrayList = creator.createArrayList();
        //then
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }
}
