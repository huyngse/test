package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        setItemType("Vase");
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        setItemType("Vase");
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        super.input();
        
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        //HEIGHT
         do {
            try {
                System.out.print("Height: ");
                height = Integer.parseInt(scanner.nextLine());
                if (height <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Height is not valid!");
            }
        } while (!isValid);
         //MATERIAL
         isValid = false;
        do {
            try {
                System.out.print("Material: ");
                material = scanner.nextLine();
                if (material.isEmpty()) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Material is not valid!");
            }
        } while (!isValid);
         
    }

    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

}
