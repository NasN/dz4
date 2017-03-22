package com.company;
public class Queen extends Chess {
    public Queen(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }

    public String name = "Queen";
    public void onChessQueen() {
        this.setName(name);
        System.out.println(this.getName());
    }
    public static boolean action(int vertically, int horizontally, int crosswise) {

        if (vertically >= 1 && vertically < 8) {
            return true;
        }
        if (horizontally >= 1 && horizontally < 8) {
            return true;
        }
        if (crosswise >= 1 && crosswise < 6) {
            return true;
        }
        return false;
    }
}
