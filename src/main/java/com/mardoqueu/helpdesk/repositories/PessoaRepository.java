package com.mardoqueu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mardoqueu.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
