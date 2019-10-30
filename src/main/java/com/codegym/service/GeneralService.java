package com.codegym.service;

public interface GeneralService<E> {
    Iterable<E> findAll();
    void save(E e);
    void remove(Long id);
    E findById(Long id);
}
