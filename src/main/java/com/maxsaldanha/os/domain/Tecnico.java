package com.maxsaldanha.os.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore /*Anotação corriger o erro de loop do json ao retornar uma lista com lista.*/
	@OneToMany(mappedBy = "tecnico")
	private List<OS> list = new ArrayList<>();

	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		// TODO Auto-generated constructor stub
	}

	public List<OS> getList() {
		return list;
	}

	public void setList(List<OS> list) {
		this.list = list;
	}
}
