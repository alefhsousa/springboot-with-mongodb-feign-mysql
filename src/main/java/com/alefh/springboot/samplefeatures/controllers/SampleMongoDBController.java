package com.alefh.springboot.samplefeatures.controllers;

import com.alefh.springboot.samplefeatures.mongodb.Sample;
import com.alefh.springboot.samplefeatures.mongodb.SampleMongoRepository;
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
@RequestMapping("/mongodb/sample")
public class SampleMongoDBController {

  @Autowired private SampleMongoRepository repository;

  @GetMapping
  public List<Sample> get() {
    return repository.findAll();
  }

  @GetMapping("{name}")
  public List<Sample> getByName(@PathVariable String name) {
    return repository.findByName(name);
  }

  @PutMapping
  public void put(@RequestBody Sample sample) {
    repository.save(sample);
  }

  @PostMapping
  public void post(@RequestBody Sample sample) {
    repository.save(sample);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable String id) {
    repository.delete(id);
  }
}
