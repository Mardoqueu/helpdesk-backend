package com.mardoqueu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mardoqueu.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
