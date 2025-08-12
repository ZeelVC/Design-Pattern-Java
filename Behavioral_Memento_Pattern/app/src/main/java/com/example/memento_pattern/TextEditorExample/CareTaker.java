package com.example.memento_pattern.TextEditorExample;

import java.util.Stack;
public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        history.pop();
        editor.setContent(history.peek().getContent());
    }
}
