package uz.pdp.homework.mystack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<E> implements MyStackRepository<E>,Iterable<E> {

    private Object[] values;

    public MyStack() {
        this.values = new Object[10];
    }

    private int size = 0;


    public int capacity(){
        return values.length;
    }
    public int size(){
        return size;
    }
    @Override
    public E push(E item) {
        if(size==values.length){
            values=grow();
        }
        values[size++] = item;
        return item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        E res = (E) values[--size];
        values= Arrays.copyOf(values, size);

        return res;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (empty()) throw new EmptyStackException();
        return (E) values[size-1];
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    @Override
    public int search(Object o) {
        int i=lastIndexOf(o);
        if (i >= 0) {
            return size - i;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return (E) values[index++];
            }
        };

    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(values, size));
    }

    private int lastIndexOf(Object o){

        if (o == null) {
            for (int i = size-1; i >= 0; i--)
                if (values[i]==null)
                    return i;
        } else {
            for (int i = size-1; i >= 0; i--)
                if (o.equals(values[i]))
                    return i;
        }
        return -1;
    }


    @SuppressWarnings("unchecked")
    private E[] grow(){
        int n=(values.length*2);
        var newNode=new Object[n];
        System.arraycopy(values, 0, newNode, 0, values.length);
        return (E[]) newNode;
    }
}
