package projetoescola.model;

import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa{

	private List<Curso> cursos;

	public Aluno(Long id, String nome, LocalDate dataDeNascimento, Endereco endereco, Contato contato,
			List<Curso> cursos) {
		super(id, nome, dataDeNascimento, endereco, contato);
		this.cursos = cursos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getDataDeNascimento()=" + getDataDeNascimento() + ", getEndereco()=" + getEndereco()
				+ ", getContato()=" + getContato() + "]";
	}
}
