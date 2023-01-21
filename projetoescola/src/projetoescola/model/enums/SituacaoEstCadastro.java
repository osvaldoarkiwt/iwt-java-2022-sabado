package projetoescola.model.enums;

public enum SituacaoEstCadastro {

	ATIVO(1L,"ativo"),INATIVO(2L,"inativo"),EVADIDO(3L,"evadido"),INADIPLENTE(4L,"inadiplente");
	
	private Long id;
	private String situacao;
	
	private SituacaoEstCadastro(Long id, String situacao) {
		this.id = id;
		this.situacao = situacao;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getSituacao() {
		return situacao;
	}
}