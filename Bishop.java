package com.company;
public class Bishop extends Chess{
    public String name = "Bishop";

    public Bishop(int firstStep, int nextStep, String name, String color, String white, String black) {
        super(firstStep, nextStep, name, color, white, black);
    }

    public void onChessBishop(){
        this.setName(name);
        System.out.println(this.getName());
    }
    public static boolean action(int vertically, int horizontally, int crosswise) {

        if (vertically == 0 && horizontally == 0&&crosswise>=1) {
            return true;
        }
        return false;

    }
}
