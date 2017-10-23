package com.alefh.springboot.samplefeatures.mysql;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SanpleMysqlRepository extends CrudRepository<SampleModelMysql, Long> {

  List<SampleModelMysql> findByName(String name);
  List<SampleModelMysql> findAll();
}
