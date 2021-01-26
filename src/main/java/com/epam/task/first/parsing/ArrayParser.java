package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;


public class ArrayParser {
    private ArrayValidator arrayValidator;

    public Array parseArrayFromString(String stringArray) {
        stringArray = stringArray.trim();
        int number;
        List<Integer> elements = new ArrayList<Integer>();
        String[] elementsString = stringArray.split(" ");
        for (int i = 0; i < elementsString.length; i++) {
            number = Integer.parseInt(elementsString[i]);
            elements.add(number);
        }
        Array array = new Array(elements);
        return array;
    }
}
