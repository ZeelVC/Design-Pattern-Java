package com.example.behavioral_command_pattern.WithoutCommandPattern;


class TextEditor {
    public void boldText(){
        System.out.println("Text has been bolded.");
    }

    public void italicText(){
        System.out.println("Text has been italicized");
    }
}

class BoldButton {
    private TextEditor textEditor;
    public BoldButton(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.boldText();
    }
}

class ItalicButton {
    private TextEditor textEditor;
    public ItalicButton(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.italicText();
    }
}
public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldButton boldButton = new BoldButton(textEditor);
        ItalicButton italicButton = new ItalicButton(textEditor);

        boldButton.click();
        italicButton.click();
    }
}
