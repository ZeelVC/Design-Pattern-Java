package com.example.behavioral_command_pattern.WithCommandPattern;

interface Command {
    void execute();
}

class BoldCommand implements Command{
    private TextEditor textEditor;

    public BoldCommand (TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void execute(){
        textEditor.boldText();
    }
}

class ItalicCommand implements Command {
    private TextEditor textEditor;

    public ItalicCommand (TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italicText();
    }
}

class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}

class TextEditor {
    public void boldText(){
        System.out.println("Text has been bolded.");
    }

    public void italicText(){
        System.out.println("Text has been italicized");
    }
}

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Button button = new Button();

        button.setCommand(new BoldCommand(textEditor));
        button.click();
        button.setCommand(new ItalicCommand(textEditor));
        button.click();
    }
}
