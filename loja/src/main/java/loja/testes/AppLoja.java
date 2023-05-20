package loja.testes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import loja.testes.model.Funcionario;
import loja.testes.model.Produto;

public class AppLoja {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		EntityManager em = factory.createEntityManager();
		/*
		Funcionario funcionario = new Funcionario();
		
		Produto produto1 = new Produto("abacaxi",15.2,10);
		
		Produto produto2 = new Produto("laranja",10.0,20);
		
		Produto produto3 = new Produto("abacate",18.1,10);
		
		Produto produto4 = new Produto("tangerina",8.2,18);
		
		Produto produto5 = new Produto("manga",5.8,5);
		
		funcionario.setNome("Ana");
		funcionario.setFuncao("Diretora");
		em.persist(funcionario);
		em.persist(produto1);
		em.persist(produto2);
		em.persist(produto3);
		em.persist(produto4);
		em.persist(produto5);
			
		*/
	
		em.getTransaction().begin();
		
		Produto produto = em.find(Produto.class, 3L);
		
		String sql = "select p from Produto p";
		
		List<Produto> produtos = em.createQuery(sql).getResultList();
		
		em.getTransaction().commit();
		
		em.close();
		
		produtos.forEach(System.out::println);
		
		System.out.println(produto);
	}
}
