package com.mardoqueu.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mardoqueu.helpdesk.domain.dtos.TecnicoDTO;
import com.mardoqueu.helpdesk.domain.enums.Perfil;

@Entity
public class Tecnico extends Pessoa{
	
	
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@OneToMany(mappedBy = "tecnico")
	private List<Chamado> chamados = new ArrayList<>();

	public Tecnico() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}
	
	public Tecnico(TecnicoDTO obg) {
		super();
		this.id = obg.getId();
		this.nome = obg.getNome();
		this.cpf = obg.getCpf();
		this.email = obg.getEmail();
		this.senha = obg.getSenha();
		this.perfis = obg.getPerfis().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
		this.dataCriacao = obg.getDataCriacao();
	}


	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	

}
