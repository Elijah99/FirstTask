package com.epam.task.first.entities;

import java.util.*;

public class Array {

    private final List<Integer> elements;

    public Array(Integer... elements) {
        this.elements = new ArrayList<Integer>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        Collections.sort(array.elements);
        Collections.sort(elements);
        return Objects.equals(elements, array.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}