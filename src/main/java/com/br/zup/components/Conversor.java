package com.br.zup.components;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Conversor {

  public ModelMapper modelMapper(){ return new ModelMapper();}
}
