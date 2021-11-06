package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ReportModel;


//  Factory method

public class ReportService {

	public void ReportModelChoice (ReportModel report) {
		report.generate();
		
	}
	
	
}
