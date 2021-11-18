package com.br.zup.controller;

import com.br.zup.DTO.LeadRepository;
import com.br.zup.Service.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")
public class controllerLead {

    @Autowired
    private Service service;
    @Autowired
    private ModelMapper modelMapper;
}
