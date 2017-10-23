package com.alefh.springboot.samplefeatures;

import com.alefh.springboot.samplefeatures.feign.ConsultaCep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@EnableJpaAuditing
@EnableFeignClients(basePackageClasses = ConsultaCep.class)
public class SampleFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleFeaturesApplication.class, args);
	}
}
