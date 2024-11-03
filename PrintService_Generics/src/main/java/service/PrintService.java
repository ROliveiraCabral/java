package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private final List<T> list = new ArrayList<>();

    public void addValues(T value) {
        list.add(value);
    }

    public void first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        System.out.println("First: " + list.getFirst());
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.getFirst());
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
