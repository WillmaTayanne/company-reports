package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements DatabaseConnection {

	//Implementação da databaseConnection para a correção da Factory Method 

	
    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run MySQL query");
    }

}
