package com.alefh.springboot.samplefeatures.mongodb;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SampleMongoRepository extends MongoRepository<Sample, String> {

  List<Sample> findByName(String name);

}
