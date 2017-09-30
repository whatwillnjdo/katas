package com.tdd.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

    int numStored = 0;
    List<T> storage;

    public Stack() {
        storage = new ArrayList<T>();
    }

    public int size() {
        return numStored;
    }

    public void push(T value) {
        storage.add(value);
        numStored++;
    }

    public T pop() {
        if(numStored == 0) {
            throw new UnderflowException();
        }

        return storage.remove(--numStored);
    }

    public T peek() {
        if(numStored - 1 < 0) {
            throw new EmptyStackException();
        }

        return storage.get(numStored - 1);
    }
}
