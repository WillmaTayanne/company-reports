package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnection;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends ReportModel {

	// Extendo para a classe de reportModel com correção de templete method e factory metedho

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();


	@Override
	protected DatabaseConnection getConnector() {
		return new MysqlDatabaseConnector(); 
	}

	@Override
	protected void executeQuery() {
		 System.out.println("Executing MySQL Query...");
	        String query = "SELECT * FROM taxes";
	        connector.executeQuery(query);
	}
	
	@Override
	protected void convertTo() {
        System.out.println("Converting To PDF...");
		
	}

}
