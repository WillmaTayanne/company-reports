package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements DatabaseConnection {

	//Implementa��o da databaseConnection para a corre��o da Factory Method 

	
	public void openConnection() {
		 System.out.println("Create postgres connetion");
		
	}

	public void executeQuery(String query) {
	 System.out.println("Run MyPostgreSQL query");
	}

}
