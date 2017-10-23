package com.alefh.springboot.samplefeatures.controllers;

import com.alefh.springboot.samplefeatures.feign.Cep;
import com.alefh.springboot.samplefeatures.feign.ConsultaCep;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign/cep/")
public class FeignController {

  @Autowired private ConsultaCep consultaCep;

  @GetMapping("{cep}")
  public Map<Object, Object> getCep(@PathVariable String cep) {
    return consultaCep.consultaCepPostMon(cep);
  }

  @GetMapping("/customizado/{cep}")
  public Cep getCepCustomizado(@PathVariable String cep) {
    return consultaCep.cepCustomizado(cep);
  }

}
