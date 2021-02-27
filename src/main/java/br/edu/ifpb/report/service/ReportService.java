package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.Report;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    public void generateReport(Report report) {
        report.generate();
    }

}
