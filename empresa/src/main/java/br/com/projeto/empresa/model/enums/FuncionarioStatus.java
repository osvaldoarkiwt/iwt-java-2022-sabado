package br.com.projeto.empresa.model.enums;

public enum FuncionarioStatus {
	
	ATIVO(1,"ativo"), AFASTADO(2,"afastado"), APOSENTADO(3,"aposentado"), DESLIGADO(4,"desligado");

	private final Integer codigo;
	
	private final String descricao;
	
	private FuncionarioStatus(Integer codigo ,String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
}
