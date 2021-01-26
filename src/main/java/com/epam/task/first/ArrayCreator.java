package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayParser;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    private ArrayValidator arrayValidator;
    private ArrayParser arrayParser;
    private DataReader dataReader;

    public List<Array> createArrayList() {
        List<Array> arrayList = new ArrayList<Array>();
        List<String> stringArray;
        try {
            stringArray = dataReader.readData();
            for (String line : stringArray) {
                boolean isStringValid = arrayValidator.validateStringArray(line);
                if (isStringValid) {
                    Array arrayElement = arrayParser.parseArrayFromString(line);
                    arrayList.add(arrayElement);
                }
            }

        } catch (DataException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public ArrayCreator(DataReader dataReader, ArrayParser arrayParser, ArrayValidator arrayValidator) {
        this.dataReader = dataReader;
        this.arrayParser = arrayParser;
        this.arrayValidator = arrayValidator;

    }
}
