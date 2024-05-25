import java.sql.*;

public class Programa {

	private static final String URL = "jdbc:mysql://localhost:3306/db_loja";
	private static final String USERNAME = "USER";
	private static final String PASSWORD = "SUA_SENHA";

	public static void main(String[] args) throws SQLException {

		System.out.println("\nPrograma com Acesso ao Banco de Dados");

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "SELECT * FROM tb_pessoas";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				System.out.println("Nome: " + nome);
			}

			resultSet.close();
			statement.close();

		} catch (Exception e) {
			System.out.println("Erro ao tentar acessar o banco!");
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (conn != null)
				conn.close();
			System.out.println("Operação concluída!");
		}
	}
}
