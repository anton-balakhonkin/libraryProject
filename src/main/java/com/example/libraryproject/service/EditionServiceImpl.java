package com.example.libraryproject.service;

import com.example.libraryproject.entity.Edition;
import com.example.libraryproject.repository.EditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditionServiceImpl implements EditionService{
    private final EditionRepository er;

    @Autowired
    public EditionServiceImpl(EditionRepository er) {
        this.er = er;
    }

    @Override
    public void save(Edition edition) {
        er.save(edition);
    }

    @Override
    public List<Edition> getAll() {
        return er.findAll();
    }

    @Override
    public List<Edition> findEditionByPart(String string) {
        return er.findEditionsByTitleOrDescriptionContains(string, string);
    }


}
