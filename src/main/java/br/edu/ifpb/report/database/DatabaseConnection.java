package br.edu.ifpb.report.database;

public interface DatabaseConnection {

	//cria��o de interface databaseConnection para a corre��o da Factory Method 

	  public void openConnection();
	  public void executeQuery(String query);
	
}
