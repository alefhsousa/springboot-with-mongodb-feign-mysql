package com.alefh.springboot.samplefeatures.feign;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude ={ "bairro", "estado"})
public class Cep {
  private String bairro;
  private String cidade;
  private String cep;
  private String estado;
}
