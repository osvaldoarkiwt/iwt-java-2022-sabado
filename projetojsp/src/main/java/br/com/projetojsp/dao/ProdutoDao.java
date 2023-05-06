package br.com.projetojsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetojsp.conexao.ConnectionFactory;
import br.com.projetojsp.model.Produto;

public class ProdutoDao {
	
	private static Connection con;
			
	public ProdutoDao() {
		con = ConnectionFactory.getConnection();
	}	
		
	public void adicionarProduto(Produto produto) {
		
		String sql = "insert into produto(produto_nome, produto_preco, produto_quantidade) values(?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setInt(3, produto.getQuantidade());
			
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void editarProduto(Long id, Produto produto) {
			
		String sql = "update produto set produto_nome=?, produto_preco=?, produto_quantidade=? where id=?";

		try {
				
			PreparedStatement stmt = con.prepareStatement(sql);
				
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setLong(4, id);
			stmt.execute();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletarProduto(Long id) {
		
		String sql = "delete from produto where id=?";

		try {
				
			PreparedStatement stmt = con.prepareStatement(sql);
				
			stmt.setLong(1, id);
			stmt.execute();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Produto> listarProdutos(){

		List<Produto> produtos = new ArrayList<>();
		
		String sql = "select * from produto";

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Produto produto = new Produto();
				
				produto.setId(rs.getLong("id"));
				produto.setNome(rs.getString("produto_nome"));
				produto.setPreco(rs.getDouble("produto_preco"));
				produto.setQuantidade(rs.getInt("produto_quantidade"));
				
				produtos.add(produto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produtos;
	}
	
	public Produto buscarProdutosPorId(Long id){
		
		String sql = "select * from produto where id = ?";

		Produto produto = new Produto();

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(sql);
			
			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {		
				
				produto.setId(rs.getLong("id"));
				produto.setNome(rs.getString("produto_nome"));
				produto.setPreco(rs.getDouble("produto_preco"));
				produto.setQuantidade(rs.getInt("produto_quantidade"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return produto;
	}
}
