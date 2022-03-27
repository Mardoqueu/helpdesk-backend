package com.mardoqueu.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mardoqueu.helpdesk.domain.Chamado;
import com.mardoqueu.helpdesk.domain.Cliente;
import com.mardoqueu.helpdesk.domain.Tecnico;
import com.mardoqueu.helpdesk.domain.enums.Perfil;
import com.mardoqueu.helpdesk.domain.enums.Prioridade;
import com.mardoqueu.helpdesk.domain.enums.Status;
import com.mardoqueu.helpdesk.repositories.ChamadoRepository;
import com.mardoqueu.helpdesk.repositories.ClienteRepository;
import com.mardoqueu.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Mardoqueu Sousa", "921.088.840-50", "mardoqueu@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "João Ninguém", "611.640.830-31", "joao.niguem@gmail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
