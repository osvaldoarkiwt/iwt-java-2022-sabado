package br.com.projeto.empresa.model.embedded;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Endereco {

	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
	
}
