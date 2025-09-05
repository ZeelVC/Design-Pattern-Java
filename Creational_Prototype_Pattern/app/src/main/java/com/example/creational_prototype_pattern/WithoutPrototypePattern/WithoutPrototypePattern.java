package com.example.creational_prototype_pattern.WithoutPrototypePattern;

import java.util.ArrayList;
import java.util.List;

class GameBoard {
    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece){
        pieces.add(piece);
    }

    public List<GamePiece> getPieces(){
        return pieces;
    }

    public void showBoardState(){
        for(GamePiece piece:pieces){
            System.out.println(piece);
        }
    }
}

class GamePiece {
    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    private String color;
    private int position;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    public GamePiece(String color,int position){
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
public class WithoutPrototypePattern {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedBoard = new GameBoard();
        for(GamePiece piece: gameBoard.getPieces()){
            copiedBoard.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
