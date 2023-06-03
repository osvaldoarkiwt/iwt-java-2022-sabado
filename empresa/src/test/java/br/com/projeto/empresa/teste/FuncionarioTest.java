package br.com.projeto.empresa.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.empresa.model.Funcionario;
import br.com.projeto.empresa.model.embedded.Endereco;

public class FuncionarioTest extends InicializacaoTest{
	
	@Test
	public void adicionarFuncionario() {
		
		Endereco endereco = new Endereco("Carolino de Aquino","123","600000","Bairro de Fátima");
		
		Funcionario funcionario = new Funcionario("Letícia",26,endereco);
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(funcionario);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsulta = entityManager.find(Funcionario.class, funcionario.getId());
		
		Assert.assertNotNull(funcionarioConsulta);
	}
	
	//@Test
	public void excluirFuncionario() {
		
		Funcionario funcionarioDelete = entityManager.find(Funcionario.class, 2L);

		entityManager.getTransaction().begin();
		
		entityManager.remove(funcionarioDelete);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsultaDelete = entityManager.find(Funcionario.class,2L);
		
		Assert.assertNull(funcionarioConsultaDelete);		
	}
	

	//@Test
	public void editarFuncionario() {
		
		Funcionario funcionarioEditar = entityManager.find(Funcionario.class, 4L);
		
		entityManager.getTransaction().begin();
		
		funcionarioEditar.setId(4L);
		
		funcionarioEditar.setNome("Roberto Carlos");
		
		funcionarioEditar.setIdade(89);
		
		//funcionarioEditar.setEndereco("Meireles");
		
		entityManager.merge(funcionarioEditar);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsulta = entityManager.find(Funcionario.class, funcionarioEditar.getId());
		
		Assert.assertNotNull(funcionarioConsulta);
	}
	
}
