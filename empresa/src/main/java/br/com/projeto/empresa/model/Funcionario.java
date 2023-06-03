package br.com.projeto.empresa.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.projeto.empresa.model.embedded.Endereco;
import br.com.projeto.empresa.model.enums.FuncionarioStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="funcionarios")
@Data
@NoArgsConstructor
@ToString
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	@Embedded
	private Endereco endereco;
	@Enumerated(EnumType.STRING)
	private FuncionarioStatus funcionarioStatus;
	
	public Funcionario(String nome, Integer idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		funcionarioStatus = FuncionarioStatus.ATIVO;
	}
}


