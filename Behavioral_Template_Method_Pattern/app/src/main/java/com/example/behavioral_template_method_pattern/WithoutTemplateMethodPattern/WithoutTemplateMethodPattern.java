package com.example.behavioral_template_method_pattern.WithoutTemplateMethodPattern;

class CSVParser {
    public void parser(){
        openFile();
        System.out.println("Parsing a CSV File.");
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening File");
    }

    public void closeFile(){
        System.out.println("Closing File");
    }
}

class JSONParser {
    public void parser(){
        openFile();
        System.out.println("Parsing a JSON File.");
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening File");
    }

    public void closeFile(){
        System.out.println("Closing File");
    }
}

public class WithoutTemplateMethodPattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parser();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parser();
    }
}
