package com.alefh.springboot.samplefeatures.feign;

import java.util.Map;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "api.postmon.com.br/v1/cep/", name = "apipostmon")
public interface ConsultaCep {

  @GetMapping("{cep}")
  Map<Object, Object> consultaCepPostMon(@PathVariable("cep") String cep);

  @GetMapping("{cep}")
  Cep cepCustomizado(@PathVariable("cep") String cep);

}
