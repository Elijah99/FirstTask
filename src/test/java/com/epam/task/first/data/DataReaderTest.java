package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DataReaderTest {
    private final List<String> test_data = Arrays.asList("1 2 3", "12 2 3e");

    @Test
    public void testReadDataShouldReadDataFromFileWhenFileExists() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        //when
        List<String> list = dataReader.readData();
        //then
        Assert.assertEquals(list, test_data);
    }
}
