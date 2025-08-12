package com.example.memento_pattern.GraphicEdiitorExample;

import android.graphics.pdf.models.FormEditRecord;

public class EditorMemento {
    private final String ShapeType;
    private final int x;
    private final int y;
    private final String Color;
    private final int Size;

    public EditorMemento(String ShapeType, int x, int y, String Color, int Size){
        this.ShapeType = ShapeType;
        this.x = x;
        this.y = y;
        this.Color = Color;
        this.Size = Size;
    }

    public String getShapeType() {
        return ShapeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return Color;
    }

    public int getSize() {
        return Size;
    }
}
