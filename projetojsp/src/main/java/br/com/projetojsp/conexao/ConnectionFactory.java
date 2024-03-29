package br.com.projetojsp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String URL = "jdbc:postgresql://127.0.0.1:5432/db_loja";
	private static final String USER = "";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(URL, USER, PASSWORD);
			
		}catch(Exception e) {
			throw new RuntimeException("erro ao conectar com o banco:",e);
		}
	}
}