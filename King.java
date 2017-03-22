package com.company;
public class King extends Chess{

    public King(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }
    public String name = "King";

    public void onChessKing() {
        this.setName(name);
        System.out.println(this.getName());
    }
    public static boolean action(int vertically, int horizontally, int crosswise) {

        if (vertically >= 1 && vertically < 1) {
            return true;
        }
        if (horizontally >= 1 && horizontally < 1) {
            return true;
        }
        if (crosswise >= 1 && crosswise< 1) {
            return true;
        }
        return false;
    }
}
