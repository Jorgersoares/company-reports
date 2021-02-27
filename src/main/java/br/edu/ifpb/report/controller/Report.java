package br.edu.ifpb.report.controller;

public abstract class Report {

    public void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToFile();
    }

    public void createDatabaseConnection() {}

    public void executeQuery() {}

    public void convertToFile(){}
}
