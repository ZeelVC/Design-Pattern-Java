package com.example.memento_pattern.GraphicEdiitorExample;

import java.util.Stack;

public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(GraphicEditor editor){
        history.push(editor.save());
    }

    public void undo(GraphicEditor editor){
        history.pop();
        EditorMemento currentState = history.peek();
        editor.setShape(currentState.getShapeType(), currentState.getX(), currentState.getY(), currentState.getColor(), currentState.getSize());
    }
}
