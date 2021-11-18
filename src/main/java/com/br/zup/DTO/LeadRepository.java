package com.br.zup.DTO;

import org.springframework.data.repository.CrudRepository;

public interface LeadRepository extends CrudRepository<Lead, String> {
    boolean existsByLeadNome(String nome);
}
