package com.example.behavioral_template_method_pattern.WithTemplateMethodPattern;

abstract class DataParser{
    public void parser(){
        openFile();
        dataParser();
        closFile();
    }

    protected void openFile(){
        System.out.println("Opening a File.");
    }

    protected void closFile(){
        System.out.println("Closing a File.");
    }

    protected abstract void dataParser();
}

class CSVParser extends DataParser{
    @Override
    protected void dataParser() {
        System.out.println("Parsing a CSV File.");
    }
}

class JSONParser extends DataParser{
    @Override
    protected void dataParser() {
        System.out.println("Parsing a JSON File.");
    }
}

public class WithTemplateMethodPattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parser();
        DataParser jsonParser = new JSONParser();
        jsonParser.parser();
    }
}
