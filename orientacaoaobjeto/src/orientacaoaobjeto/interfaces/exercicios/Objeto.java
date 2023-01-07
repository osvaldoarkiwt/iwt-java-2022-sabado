package orientacaoaobjeto.interfaces.exercicios;

import java.time.LocalDate;

public class Objeto {
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	private String endereco;

	public Objeto() {
		
	}
	
	public Objeto(String nome, LocalDate dataNascimento, String endereco) {
	
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Objeto [nome=" + nome + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + "]";
	}
}	
	
	

