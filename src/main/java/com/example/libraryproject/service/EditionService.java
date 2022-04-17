package com.example.libraryproject.service;

import com.example.libraryproject.entity.Edition;

import java.util.List;

public interface EditionService {

    void save(Edition edition);
    List<Edition> getAll();
    List<Edition> findEditionByPart(String string);
}
