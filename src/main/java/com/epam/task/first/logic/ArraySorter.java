package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArraySorter {

    public Array sortArrayBubbleAsc(Array array) {
        List<Integer> elements = array.getElements();
        int bufferElement = 0;
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if (elements.get(i) < elements.get(j)) {
                    bufferElement = elements.get(i);
                    elements.set(i, elements.get(j));
                    elements.set(j, bufferElement);
                }
            }
        }

        Array sortedArray = new Array(elements);
        return sortedArray;
    }

    public Array sortArrayBubbleDesc(Array array) {
        List<Integer> elements = array.getElements();
        int bufferElement = 0;
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if (elements.get(i) > elements.get(j)) {
                    bufferElement = elements.get(i);
                    elements.set(i, elements.get(j));
                    elements.set(j, bufferElement);
                }
            }
        }

        Array sortedArray = new Array(elements);
        return sortedArray;
    }

    public List<Array> sortArrayListBubbleAsc(List<Array> arrayList) {
        List<Array> sortedArrayList = new ArrayList<Array>();
        for (Array array : arrayList) {
            Array sortedArray = sortArrayBubbleAsc(array);
            sortedArrayList.add(sortedArray);
        }
        return sortedArrayList;
    }

    public List<Array> sortArrayListBubbleDesc(List<Array> arrayList) {
        List<Array> sortedArrayList = new ArrayList<Array>();
        for (Array array : arrayList) {
            Array sortedArray = sortArrayBubbleDesc(array);
            sortedArrayList.add(sortedArray);
        }
        return sortedArrayList;
    }
}
