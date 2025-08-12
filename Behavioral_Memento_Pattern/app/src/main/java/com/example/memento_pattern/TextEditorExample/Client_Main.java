package com.example.memento_pattern.TextEditorExample;

public class Client_Main {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        editor.setContent("First");
        careTaker.saveState(editor);

        editor.setContent("Second");
        careTaker.saveState(editor);

        editor.setContent("Third");
        careTaker.saveState(editor);

        System.out.println(editor.getContent());

        careTaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
