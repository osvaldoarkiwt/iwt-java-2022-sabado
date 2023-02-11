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
		Double aliquota = 0.0;
		if(salario <= 1302.00) {
			aliquota = 0.075;
		} else if(salario>=1302.01 || salario<=2571.29) {
			aliquota = 0.09;
		} else if(salario>=2571.30 || salario<=3856.94) {
			aliquota = 0.12;
		} else if(salario>=3856.95 || salario<=7507.49) {
			aliquota = 0.14;
		}
		return salario * aliquota;
	}

	@Override
	public Double calculaIR(Double salario) {
		Double aliquota = 0.0;
		if(salario <= 1903.98) {
			aliquota = 0.0;
		} else if(salario>=1903.99 || salario<=2826.65) {
			aliquota = 0.075;
		} else if(salario>=2826.66 || salario<=3751.05) {
			aliquota = 0.15;
		} else if(salario>=3751.06 || salario<=4664.68) {
			aliquota = 0.225;
		} else {
			aliquota = 0.275;
		}
		return salario * aliquota;
	}

	@Override
	public Double calculavaleRefeicao(Double salario) {
		return salario * 0.2;
	}

	@Override
	public Double calculavaleTransporte(Double salario) {
		return salario * 0.06;
	}
}
