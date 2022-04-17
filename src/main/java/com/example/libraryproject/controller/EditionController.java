package com.example.libraryproject.controller;

import com.example.libraryproject.entity.Edition;
import com.example.libraryproject.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EditionController {

    private final EditionService es;

    @Autowired
    public EditionController(EditionService es) {
        this.es = es;
    }

    @GetMapping("/editions")
    public List<Edition> showAllEditions(){
        return es.getAll();
    }

    @PostMapping("/new")
    public Edition saveEdition(@RequestBody Edition edition) {
        es.save(edition);
        return edition;
    }

    @GetMapping("/editions/{text}")
    public List<Edition> findEditionByPart(@PathVariable String text) throws NoSuchFieldException {
        List<Edition> list = es.findEditionByPart(text);
        if (list == null){
            throw new NoSuchFieldException ("There is no Edition with text = " + text + " in database");
        }
        return list;
    }
}
