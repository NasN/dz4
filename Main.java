package com.company;
public class Main {

    public static void main(String[] args) {
        Pawn pawn = new Pawn(2, 0, "Pawn", "color", "white", "black");
        System.out.println(pawn.getName()+":" + Pawn.action(3, 0, 0));
        Bishop bishop = new Bishop(2, 0, "Bishop", "color", "white", "black");
        System.out.println(bishop.getName()+ ":" + Bishop.action(0, 0, 1));
        Knight knight = new Knight(2,0,"Knigh","color","white","black");
        System.out.println(knight.getName()+":"+Knight.action(2,1,0));
        Castle castle = new Castle(0,1,"Castle","color","white","black");
        System.out.println(castle.getName()+":"+Castle.action(8,0,0));
        Queen queen = new Queen(1, 0,"Queen","color","white","black");
        System.out.println(queen.getName()+":"+Queen.action(0,4,0));
        King king = new King(1,0,"King","color","white","black");
        System.out.println(king.getName()+":"+King.action(2,0,0));
    }
}
