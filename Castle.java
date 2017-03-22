package com.company;

public class Castle extends Chess {

    public Castle(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }

    public String name = "Castle";

    public void onChessCastle() {
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
        return false;
    }
}