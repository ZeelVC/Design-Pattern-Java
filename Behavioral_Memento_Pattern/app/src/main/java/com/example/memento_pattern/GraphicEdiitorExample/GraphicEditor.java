package com.example.memento_pattern.GraphicEdiitorExample;

/*
You are designing a graphic editor application that enables users to create and manipulate various shapes, such as circles, squares, and rectangles. Each shape has attributes, including:

Position (x, y)
Color
Size
Users should be able to modify these attributes. Additionally, implement an undo feature that allows users to revert any changes made to a shape's attributes.
 */

public class GraphicEditor {
    private String ShapeType;
    private int x;
    private int y;
    private String Color;
    private int Size;


    public EditorMemento save(){
        return new EditorMemento(ShapeType, x, y, Color, Size);
    }

    public void setShape(String ShapeType, int x, int y, String Color, int Size){
        this.ShapeType = ShapeType;
        this.x = x;
        this.y = y;
        this.Color = Color;
        this.Size = Size;
    }


    public String getShape(){
        return "Shape: " + ShapeType + ", Position: (" + x + ", " + y + "), Color: " + Color + ", Size: " + Size;
    }

}
