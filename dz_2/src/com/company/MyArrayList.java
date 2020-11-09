package com.company;

public class MyArrayList<T> {
    private int _size = 0;
    private Object[] arr;

    public MyArrayList(int num) {
        arr = new Object[num];
    }

    public MyArrayList() {
        this(5);
    }

    public int size() {
        return _size;
    }

    public void resize(int n) {
        Object[] arr2 = new Object[n];

        _size =n-1;

        for(int j = 0; j < this.size(); j++) {
            arr2[j] = arr[j];
        }

        arr = arr2;
    }

    public void add(T t) {
        if(_size == arr.length)
            resize(_size +1);

        arr[_size++] = t;
    }

    public void remove(int index) {
        if(index > this.size()-1) {
            System.out.print("The specified index cannot be greater than the last index");
            return;
        }
        else if(index < 0){
            System.out.print("The index cannot be less than 0");
            return;
        }

        arr[index] = null;
        for(int j = index; j < this.size(); j++)
        {
            T t = (T) arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = t;
        }
        this._size--;

    }

    public T get(int index) {
        return (T) arr[index];
    }

    public boolean contains(T t) {
        for(int j = 0; j < this.size(); j++) {
            if(arr[j] == t){
                return true;
            }

        }

        return false;
    }
}
