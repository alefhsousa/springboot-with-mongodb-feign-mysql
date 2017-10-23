package com.alefh.springboot.samplefeatures.controllers;

import com.alefh.springboot.samplefeatures.mysql.SanpleMysqlRepository;
import com.alefh.springboot.samplefeatures.mysql.SampleModelMysql;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mysql/sample")
public class SampleMysqlController {

    @Autowired
    private SanpleMysqlRepository repository;

    @GetMapping
    public List<SampleModelMysql> get() {
      return repository.findAll();
    }

    @GetMapping("{name}")
    public List<SampleModelMysql> getByName(@PathVariable String name) {
      return repository.findByName(name);
    }

    @PutMapping
    public void put(@RequestBody SampleModelMysql sample) {
      repository.save(sample);
    }

    @PostMapping
    public void post(@RequestBody SampleModelMysql sample) {
      repository.save(sample);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
      repository.delete(id);
    }
}