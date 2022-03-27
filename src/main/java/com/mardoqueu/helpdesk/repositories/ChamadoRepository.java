package com.mardoqueu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mardoqueu.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
