package com.mardoqueu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mardoqueu.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
