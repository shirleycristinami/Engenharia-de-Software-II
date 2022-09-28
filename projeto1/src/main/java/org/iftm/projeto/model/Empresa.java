package org.iftm.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEmpresa")
	private Integer id;
	@Column(name = "nome_Empresa")
	private String nome;
	@Column(name = "endereco_Empresa")
	private String endereco;
	@Column(name = "responsavel_Empresa")
	private String responsavel;

	public Empresa(Integer idEmpresa, String nome, String endereco, String responsavel) {
		super();
		this.id = idEmpresa;
		this.nome = nome;
		this.endereco = endereco;
		this.responsavel = responsavel;
	}

	public Empresa() {
	}

	public Integer getIdEmpresa() {
		return id;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.id = idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}
