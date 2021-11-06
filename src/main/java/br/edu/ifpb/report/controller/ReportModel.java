package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnection;

//criação da classe ReportModel para a correção da Template Method. 

public abstract class ReportModel {

	abstract protected DatabaseConnection getConnector();
    protected DatabaseConnection con;

    public void generate() {
        this.createDatabaseConnection();
        this.executeQuery();
        this.convertTo();
        
    }
    
	public void createDatabaseConnection() {
    	 System.out.println("Creating Database Connection...");
         this.con = this.getConnector();
         con.openConnection();
    	
    }
	 abstract void executeQuery();
	 
	 //Ele pode converter tanto para pdf como para XSL
	 abstract void convertTo();
	
    
}




