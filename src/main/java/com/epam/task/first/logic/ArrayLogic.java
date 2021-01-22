package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

class ArrayLogic {

    public int findMax(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        int max = arrayList.get(0);

        for (Integer element : arrayList) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public int findMin(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        int min = arrayList.get(0);

        for (Integer element : arrayList) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public Array updateArrayByIndex(Array array, int index, int updatedValue) {
        isArrayEmpty(array);
        isIndexValid(array, index);

        List<Integer> arrayList = array.getElements();

        arrayList.set(index, updatedValue);

        Array updatedArray = new Array(arrayList);
        return updatedArray;
    }

    public Array updateArrayByValue(Array array, int oldValue, int updatedValue) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == oldValue) {
                arrayList.set(i, updatedValue);
            }
        }

        Array updatedArray = new Array(arrayList);
        return updatedArray;
    }

    public float countAverage(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        float sum = 0;

        for (Integer element : arrayList) {
            sum += element;
        }

        float averageValue = sum / arrayList.size();
        return averageValue;

    }

    public int countSum(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        int sum = 0;

        for (Integer element : arrayList) {
            sum += element;
        }

        return sum;

    }

    public int countPositive(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        int countPositive = 0;

        for (Integer element : arrayList) {
            if (element > 0) {
                countPositive++;
            }
        }

        return countPositive;
    }

    public int countNegative(Array array) {
        isArrayEmpty(array);

        List<Integer> arrayList = array.getElements();
        int countNegative = 0;

        for (Integer element : arrayList) {
            if (element < 0) {
                countNegative++;
            }
        }

        return countNegative;
    }

    private boolean isArrayEmpty(Array array) {

        if (array == null) {
            throw new IllegalArgumentException("Array is empty");
        } else if (array.getElements().size() == 0) {
            throw new IllegalArgumentException("Array is empty");
        } else {
            return false;
        }
    }

    private boolean isIndexValid(Array array, int index) {
        int arraySize = array.getElements().size();
        if (index >= arraySize || index < 0) {
            throw new IllegalArgumentException("Index not valid");
        } else {
            return true;
        }
    }


}
