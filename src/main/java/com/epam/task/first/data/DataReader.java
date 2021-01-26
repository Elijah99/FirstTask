package com.epam.task.first.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final String filename = "./src/test/resources/input.txt";


    public List<String> readData() throws DataException {
        String string = "";
        List<String> stringList = new ArrayList<String>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            int character = -1;
            while ((character = fileInputStream.read()) != -1) {
                if (character == '\n') {
                    stringList.add(string);
                    string = "";
                } else {
                    string += (char) character;
                }
            }

        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
        stringList.add(string);
        return stringList;
    }
}
