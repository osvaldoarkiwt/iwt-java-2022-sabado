package projetoescola.model;

import java.time.LocalDate;

public abstract class Pessoa {

	private Long id;
	private String nome;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private Contato contato;
	
	public Pessoa() {}

	public Pessoa(Long id, String nome, LocalDate dataDeNascimento,
			Endereco endereco, Contato contato) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public abstract String toString();	
}
