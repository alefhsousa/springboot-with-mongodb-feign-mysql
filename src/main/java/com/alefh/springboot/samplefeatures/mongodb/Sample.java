package com.alefh.springboot.samplefeatures.mongodb;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "samples")
public class Sample {

  @Id
  private String id;
  private String name;
  private Integer version;
  @CreatedDate
  private LocalDateTime createdDate;

}
