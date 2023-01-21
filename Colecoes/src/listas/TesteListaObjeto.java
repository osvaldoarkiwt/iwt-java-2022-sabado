package listas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Joana",LocalDate.of(1990, 5, 30));
		
		Pessoa p2 = new Pessoa("Clara",LocalDate.of(1990, 5, 30));
		
		
		List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(p1,p2));
		
		Collections.sort(pessoas);
		
		//System.out.println(p1.getIdade());
		
		System.out.println(pessoas);
	}
}

class Pessoa implements Comparable<Pessoa>{
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + "]";
	}

	private String nome;
	private LocalDate dataDeNascimento;
	
	public Pessoa(String nome, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
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
	
	public Integer getIdade() {
		LocalDate hoje = LocalDate.now();
		
		return (int) dataDeNascimento.until(hoje,ChronoUnit.YEARS);
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		
		return this.getNome().compareToIgnoreCase(outraPessoa.getNome());
	}
}
