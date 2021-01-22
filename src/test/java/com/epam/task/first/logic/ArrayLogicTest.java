package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class ArrayLogicTest {

    ArrayLogic arrayLogic = new ArrayLogic();

    // -------  Tests for findMax method ---------

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, 2, 7, -12);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(7, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenOnlyNegativeNumbersApplied() {
        //given
        Array array = new Array(-11, -7, -5, -12);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-5, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        int actual = arrayLogic.findMax(array);

        //then

    }

    // -------  Tests for findMin method ---------

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 12, 45, 128, 123456789);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        int actual = arrayLogic.findMin(array);

        //then

    }

    // -------  Tests for updateArrayByIndex method ---------

    @Test
    public void testUpdateArrayByIndexShouldUpdateArrayByIndexWhenArrayNotEmptyAndIndexValid() {
        //given
        Array array = new Array(1, 2, 3, 4, 5, 6);
        int index = 2;
        int updatedValue = 999;

        //when
        Array actualArray = arrayLogic.updateArrayByIndex(array, index, updatedValue);
        int actualElementAtUpdatedIndex = actualArray.getElements().get(index);

        //then
        Assert.assertEquals(999, actualElementAtUpdatedIndex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateArrayByIndexShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.updateArrayByIndex(array,0,0);

        //then

    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateArrayByIndexShouldThrowIllegalArgumentExceptionWhenArrayNotEmptyAndIndexNotValid() {
        //given
        Array array = new Array();
        int index = -2;
        int updatedValue = 0;

        //when
        arrayLogic.updateArrayByIndex(array,index,updatedValue);

        //then

    }

    // -------  Tests for updateArrayByValue method ---------

    @Test
    public void testUpdateArrayByValueShouldUpdateArrayByValueWhenArrayNotEmptyAndArrayElementsPositive() {
        //given
        Array array = new Array(1, 2, 1, 4, 1, 6);
        int oldValue = 1;
        int updatedValue = 999;

        //when
        Array actualArray = arrayLogic.updateArrayByValue(array, oldValue, updatedValue);
        List<Integer> actualArrayList = actualArray.getElements();

        Array expectedArray = new Array(999, 2, 999, 4, 999, 6);
        List<Integer> expectedArrayList = expectedArray.getElements();

        //then
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void testUpdateArrayByValueShouldReturnSameArrayWhenArrayNotEmptyAndArrayHaveNotValueToChange() {
        //given
        Array array = new Array(1, 2, 1, 4, 1, 6);
        Array expectedArray = array;
        int oldValue = 45;
        int updatedValue = 999;

        //when
        Array actualArray = arrayLogic.updateArrayByValue(array, oldValue, updatedValue);
        List<Integer> actualArrayList = actualArray.getElements();

        List<Integer> expectedArrayList = expectedArray.getElements();

        //then
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateArrayByValueShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.updateArrayByValue(array,0,0);

        //then

    }

    // -------  Tests for countAverage method ---------

    @Test
    public void testCountAverageShouldCountAverageValueWhenArrayNotEmptyAndArrayElementsPositive() {
        //given
        Array array = new Array(1, 2, 3, 4, 5, 6);

        //when
        Float actualValue = arrayLogic.countAverage(array);
        Float expectedValue = 3.5f;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountAverageShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.countAverage(array);

        //then

    }

    // -------  Tests for countSum method ---------

    @Test
    public void testCountSumShouldCountSumWhenArrayNotEmptyAndArrayElementsPositive() {
        //given
        Array array = new Array(1, 2, 3, 4, 5, 6);

        //when
        int actualValue = arrayLogic.countSum(array);
        int expectedValue = 21;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountSumShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.countSum(array);

        //then

    }

    // -------  Tests for countPositive method ---------

    @Test
    public void testCountPositiveShouldCountPositiveElementsQuantityWhenArrayNotEmptyAndArrayElementsPositive() {
        //given
        Array array = new Array(1, 2, 3, 4, 5, 6);

        //when
        int actualValue = arrayLogic.countPositive(array);
        int expectedValue = 6;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountPositiveShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.countPositive(array);

        //then

    }

    // -------  Tests for countNegative method ---------

    @Test
    public void testCountNegativeShouldCountNegativeElementsQuantityWhenArrayNotEmptyAndArrayElementsPositive() {
        //given
        Array array = new Array(1, 2, 3, 4, 5, 6);

        //when
        int actualValue = arrayLogic.countNegative(array);
        int expectedValue = 0;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountNegativeShouldThrowIllegalArgumentExceptionWhenArrayEmpty() {
        //given
        Array array = new Array();

        //when
        arrayLogic.countSum(array);

        //then

    }

    @Test
    public void testCountNegativeShouldCountNegativeElementsQuantityWhenArrayNotEmptyAndNegativeElementsApplied() {
        //given
        Array array = new Array(1, -2, 3, -4, 5, -6);

        //when
        int actualValue = arrayLogic.countNegative(array);
        int expectedValue = 3;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCountNegativeShouldCountNegativeElementsQuantityWhenArrayNotEmptyAndAllElementsNegative() {
        //given
        Array array = new Array(-1, -2, -3, -4, -5, -6);

        //when
        int actualValue = arrayLogic.countNegative(array);
        int expectedValue = 6;

        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
