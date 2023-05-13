package loja.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppLoja {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		EntityManager em = factory.createEntityManager();
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Ana");
		funcionario.setFuncao("Diretora");
		
		em.persist(funcionario);

	}
}
