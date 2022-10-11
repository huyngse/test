package DTO;

import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        setItemType("Statue");
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        setItemType("Statue");
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue() {
        super.input();

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        //WEIGHT
        do {
            try {
                System.out.print("Weight: ");
                weight = Integer.parseInt(scanner.nextLine());
                if (weight <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Weight is not valid!");
            }
        } while (!isValid);
        //COLOUR
        isValid = false;
        do {
            try {
                System.out.print("Colour: ");
                colour = scanner.nextLine();
                if (colour.isEmpty()) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Colour is not valid!");
            }
        } while (!isValid);
    }

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

}
