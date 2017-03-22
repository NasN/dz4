package com.company;
public class Knight extends Chess {
    public String name = "Knight";
    public Knight(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }

    public void onChessKnight(){
        this.setName(name);
        System.out.println(this.getName());
    }
    public static boolean action(int vertically, int horizontally, int crosswise) {

        if (vertically == 2 && horizontally ==1&&crosswise>=0) {
            return true;
        }
        return false;

    }
}