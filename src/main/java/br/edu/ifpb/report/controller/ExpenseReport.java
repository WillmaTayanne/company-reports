package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnection;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

// Extendo para a classe de reportModel com correção de templete method e factory metedho

public class ExpenseReport extends ReportModel {

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();


	@Override
	protected DatabaseConnection getConnector() {
		return new PostgreSQLDatabaseConnector();
	}


	@Override
	protected void executeQuery() {
		 System.out.println("Executing PosgreSQL Query...");
	     String query = "SELECT * FROM taxes";
	     connector.executeQuery(query);
		
	}
	
	@Override
	protected void convertTo() {
		 System.out.println("Converting To XSL...");
		
	}

}
