package org.hbrs.se1.ws24.exercises.uebung10;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack<E> extends Stack<E> {
    private final int maxSize;

    public MyStack(int maxSize) {
        super();
        this.maxSize = maxSize;

    }

    @Override
    public E push(E item) {
        if (size() >= maxSize) {
            throw new IllegalStateException();
        }
        return super.push(item);
    }

    @Override
    public synchronized E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return super.pop();
    }

    @Override
    public synchronized E peek() {
        if (isEmpty()) {
            return null;
        }
        return super.peek();
    }

    @Override
    public synchronized int size() {
        return super.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }

}
