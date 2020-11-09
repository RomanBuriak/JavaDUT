package com.company;

public class MyLinkedList<T> {
    private Node<T> head;
    private int _size = 0;

    public void add(T t) {
        Node node = new Node<T>();
        node.data = t;

        if(head != null) {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
            _size++;
        }
        else {
            head = node;
            _size++;
        }
    }

    public void remove(int index) {
        if(_size -1 < index){
            System.out.print("The specified index cannot be greater than the last index");
            return;
        }


        Node n = head;
        for(int i = 0; i < index - 1; i++){
            n = n.next;
        }

        Node n2 = n.next;
        n.next=n2.next;
        _size--;
    }

    public boolean contains(T t){
        Node n = head;
        while(n.next != null) {
            if(n.data == t) {
                return true;
            }
            n = n.next;
        }
        return false;
    }
    public static class Node<T> {
        T data;
        Node next;
    }

    public int size(){
        return this._size;
    }

}
