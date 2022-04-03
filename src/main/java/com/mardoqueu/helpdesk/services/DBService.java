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
		Tecnico tec2 = new Tecnico(null, "Valquiria Fernandes dos Santos", "056.500.906-02", "valquiria@gmail.com", "321");
		Tecnico tec3 = new Tecnico(null, "Viviane araújo da Silveira Carvalho", "065.616.016-02", "viviane@gmail.com", "456");
		Tecnico tec4 = new Tecnico(null, "Guilherme Antônio Maia", "120.531.356-70", "guilherme@gmail.com", "654");
		Tecnico tec5 = new Tecnico(null, "Raphaela Rezende de Castro", "079.921.686-07", "raphaela@gmail.com", "654");


		Cliente cli1 = new Cliente(null, "João Ninguém", "611.640.830-31", "joao.niguem@gmail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);
		Cliente cli2 = new Cliente(null, "Adriene Moreira Vitor Lelis ", "059.144.946-30", "adriene@gmail.com", "123");
		Cliente cli3 = new Cliente(null, "Kênia Cristina Félix", "084.404.026-60", "cristina@gmail.com", "123");
		Cliente cli4 = new Cliente(null, "Romy Valéria de Araujo Toledo", "575.005.256-72", "toledo@gmail.com", "123");
		Cliente cli5 = new Cliente(null, "Raquel de Oliveira Gomes", "107.505.426-59", "raquel@gmail.com", "123");


		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 02", "Segundo Chamado", tec2,
				cli1);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamado 03", "Terceiro Chamado", tec3,
				cli1);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 04", "Quarto Chamado", tec4,
				cli1);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ABERTO, "Chamado 05", "Quinto Chamado", tec5,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
	}
}
