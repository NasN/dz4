package com.company;

public class Pawn extends Chess {
    public String name = "Pawn";
    public void onChessPawn(){
        this.setName(name);
        System.out.println(this.getName());
    }

    public Pawn(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }

    public static boolean action(int vertically, int horizontally, int crosswise) {

        if (vertically == 2 && horizontally == 0) {
            return true;
        }
        if (vertically == 1 && horizontally == 0) {
            return true;
        }
        return false;

    }
}
