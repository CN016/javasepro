package com.my016.genericity_class;

public interface Date<E> {
    void add(E e);
    void update(E e);
    void delete(int id);
    E queryById(int id);
}
