package com.epam.task.first.parsing;

import com.epam.task.first.data.DataException;

public class ArrayValidator {

    public boolean validateStringArray(String stringArray) throws DataException {
        stringArray = stringArray.trim();
        if (isStringEmpty(stringArray)) {
            throw new DataException("String array is empty");
        }

        for (Character character : stringArray.toCharArray()) {
            try {
                if (character != ' ' && character!= '-') {
                    Integer.parseInt(character.toString());
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    private boolean isStringEmpty(String stringArray) {
        if (stringArray == null || stringArray.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
