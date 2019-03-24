package com.example.alan.lahacks;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Queue data structure realized through an automatically expanding circular array
 *
 * @Author: Alan
 * @Version: 1.0
 * @param <E> Data type of objects to be held in this queue
 */
public class CircularArrayQueue<E> implements Queue {

    int size, capacity;
    int front, rear;
    Object[] innerData;

    /**
     * @param n Initial capacity of this queue
     */
    public CircularArrayQueue(int n){
        capacity = n;
        innerData = (E[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(size == capacity){
            throw new IllegalStateException();
        }
        else if(offer(o)){
            return true;
        }

        return false;
    }

    @Override
    public boolean remove(Object o) {
        Object removedObj = poll();

        if(removedObj == null){
            return false;
        }

        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        if(size == capacity){
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        innerData[rear] = (E) o;
        return true;
    }

    /**
     * Doubles the size of the current capacity array
     */
    private void reallocate(){
        Object[] newArray = (E[]) new Object[capacity * 2];
        int prevSize = size;

        for(int i = 0; i < prevSize; i++){
            newArray[i] = poll();
        }

        size = prevSize;
        capacity = capacity * 2;
        front = 0;
        rear = size - 1;
        innerData = newArray;
    }

    @Override
    public Object remove() {
        E temp = (E) poll();

        if(temp == null){
            throw new NoSuchElementException();
        }
        return temp;
    }

    @Override
    public Object poll() {
        if(isEmpty()){
            return null;
        }
        E temp = (E) innerData[front];
        front = (front + 1) % capacity;
        size--;

        return temp;
    }

    @Override
    public Object element() {
        E temp = (E) peek();

        if(temp == null){
            throw new NoSuchElementException();
        }

        return temp;
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            return null;
        }

        return innerData[front];
    }
}
