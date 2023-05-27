package br.com.projeto.empresa.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.empresa.model.Funcionario;

public class FuncionarioTest extends InicializacaoTest{
	
	@Test
	public void adicionarFuncionario() {
		
		Funcionario funcionario = new Funcionario("Marcos",30,"Varjota");
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(funcionario);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsulta = entityManager.find(Funcionario.class, funcionario.getId());
		
		Assert.assertNotNull(funcionarioConsulta);
	}
	
	@Test
	public void excluirFuncionario() {
		
		Funcionario funcionarioDelete = entityManager.find(Funcionario.class, 1L);
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(funcionarioDelete);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsultaDelete = entityManager.find(Funcionario.class,1L);
		
		Assert.assertNull(funcionarioConsultaDelete);		
	}
	

	@Test
	public void editarFuncionario() {
		
		Funcionario funcionarioEditar = entityManager.find(Funcionario.class, 2L);;
		
		entityManager.getTransaction().begin();
		
		funcionarioEditar.setId(2L);
		
		funcionarioEditar.setNome("Roberto Carlos");
		
		funcionarioEditar.setIdade(89);
		
		funcionarioEditar.setEndereco("Meireles");
		
		entityManager.persist(funcionarioEditar);
		
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		
		Funcionario funcionarioConsulta = entityManager.find(Funcionario.class, funcionarioEditar.getId());
		
		Assert.assertNotNull(funcionarioConsulta);
	}
	
}
