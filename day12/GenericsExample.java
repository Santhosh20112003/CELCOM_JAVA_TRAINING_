package com.celcom.day12;

import java.util.Map;

//interface Demo<E> {
//  E get();
//}

class Generic<T extends Comparable<Number>> {
    private T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericsExample {

    public static void main(String[] args) {
//        Generic<Integer> obj = new Generic(new Integer(5)); // Providing an integer as an example
//        System.out.println(obj.getData());
    }
}
