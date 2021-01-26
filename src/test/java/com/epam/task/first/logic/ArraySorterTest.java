package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArraySorterTest {

    private final Array DATA_POSITIVE = new Array(15, 1, 93, 5, 7, 0);
    private final Array DATA_NEGATIVE = new Array(-1, 1, -54, 3, 0, 17);
    private final List<Array> LIST_DATA_POSITIVE =
            Arrays.asList(new Array(15, 1, 93, 5, 7, 0), new Array(5, 1, 46, 58, 7999, 0));
    private final List<Array> LIST_DATA_NEGATIVE =
            Arrays.asList(new Array(-15, 1, -93, 5, -7, 0), new Array(5, -1, -46, 58, -7999, 0));

    @Test
    public void testSortArrayBubbleAscShouldSortArrayAscendingWhenPositiveNumbersApplied() {
        //given
        ArraySorter sorter = new ArraySorter();
        //when
        Array actualArray = sorter.sortArrayBubbleAsc(DATA_POSITIVE);
        Array expectedArray = new Array(0, 1, 5, 7, 15, 93);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArrayBubbleAscShouldSortArrayAscendingWhenNigativeNumbersApplied() {
        //given
        ArraySorter sorter = new ArraySorter();
        //when
        Array actualArray = sorter.sortArrayBubbleAsc(DATA_NEGATIVE);
        Array expectedArray = new Array(-54, -1, 0, 1, 3, 17);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortArrayListBubbleAscShouldSortArrayListAscendingWhenPositiveNumbersApplied() {
        //given
        ArraySorter sorter = new ArraySorter();
        //when
        List<Array> actualArrayList = sorter.sortArrayListBubbleAsc(LIST_DATA_POSITIVE);
        List<Array> expectedArrayList =
                Arrays.asList(new Array(0, 1, 5, 7, 15, 93), new Array(0, 1, 5, 46, 58, 7999));
        //then
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void testSortArrayListBubbleAscShouldSortArrayListAscendingWhenNegativeNumbersApplied() {
        //given
        ArraySorter sorter = new ArraySorter();
        //when
        List<Array> actualArrayList = sorter.sortArrayListBubbleAsc(LIST_DATA_NEGATIVE);
        List<Array> expectedArrayList =
                Arrays.asList(new Array(-93, -15, -7, 0, 1, 5), new Array(-7999, -46, -1, 0, 5, 58));
        //then
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }
}
