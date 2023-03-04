package bancodedadosjdbc.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		
		String query = "select * from cliente";
		
		String query02 = "insert into cliente (nome,cpf) values(?,?)";
 		
		try {
			PreparedStatement stmt = conn.prepareStatement(query02);
			/*
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(2));			
			}*/
			
			stmt.setString(1, "Luíz");
			stmt.setString(2, "98222787306");
			
			stmt.execute();
			
			System.out.println("registro salvo com sucesso!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
