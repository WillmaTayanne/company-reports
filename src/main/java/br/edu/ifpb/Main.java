package br.edu.ifpb;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {       
        ReportService reportService = new ReportService();

        ExpenseReport expenseReport = new ExpenseReport();
        TaxReport taxReport = new TaxReport();

        reportService.ReportModelChoice(expenseReport);
        reportService.ReportModelChoice(taxReport);
        
    }

}
