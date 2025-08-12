package com.example.memento_pattern.GraphicEdiitorExample;

public class Client_Main {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        CareTaker careTaker = new CareTaker();

        editor.setShape("Circle", 5, 9, "Green", 20);
        careTaker.saveState(editor);
        editor.setShape("Square", 9, 6, "Orange", 43);
        careTaker.saveState(editor);
        editor.setShape("Triangle", 6, 4, "Green", 23);
        careTaker.saveState(editor);

        System.out.println(editor.getShape());

        careTaker.undo(editor);

        System.out.println(editor.getShape());

    }
}
