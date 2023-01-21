package projetoescola.model;

import java.time.LocalDate;

import projetoescola.model.enums.SituacaoFunCadastro;

public class Funcionario extends Pessoa implements Tributos{

	private String cargo;
	private Integer cargaHoraria;
	private Double salario;
	private SituacaoFunCadastro situacao;
	
	public Funcionario() {};
	
	public Funcionario(Long id, String nome, LocalDate dataDeNascimento,
			Endereco endereco, Contato contato,String cargo, Integer cargaHoraria, Double salario) {
		
		super(id,nome,dataDeNascimento,endereco,contato);
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public SituacaoFunCadastro getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoFunCadastro situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", cargaHoraria=" + cargaHoraria + ", salario=" + salario + ", situacao="
				+ situacao + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getDataDeNascimento()="
				+ getDataDeNascimento() + ", getEndereco()=" + getEndereco() + ", getContato()=" + getContato() + "]";
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