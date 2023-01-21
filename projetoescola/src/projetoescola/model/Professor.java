package projetoescola.model;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Funcionario{
	
	private List<Curso> turma;
	
	public Professor(Long id, String nome, LocalDate dataDeNascimento,
			Endereco endereco, Contato contato,String cargo,Integer cargaHoraria,
			Double salario, List<Curso> turma) {
		
		super(id,nome,dataDeNascimento,endereco,contato,cargo,cargaHoraria,salario);
		this.turma = turma;
	}
		public List<Curso> getTurma() {
		return turma;
	}

	public void setTurma(List<Curso> turma) {
		this.turma = turma;
	}
	@Override
	public String toString() {
		return "Professor [turma=" + turma + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getDataDeNascimento()=" + getDataDeNascimento() + ", getEndereco()=" + getEndereco()
				+ ", getContato()=" + getContato() + ", getCargo()=" + getCargo() + ", getCargaHoraria()="
				+ getCargaHoraria() + ", getSalario()=" + getSalario() + ", getSituacao()=" + getSituacao() + "]";
	}

	@Override
	public Double calculaInss(Double salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculaIR(Double salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculavaleRefeicao(Double salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculavaleTransporte(Double salario) {
		// TODO Auto-generated method stub
		return null;
	}
}
