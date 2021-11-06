package br.edu.ifpb.report.database;

public interface DatabaseConnection {

	//criação de interface databaseConnection para a correção da Factory Method 

	  public void openConnection();
	  public void executeQuery(String query);
	
}
