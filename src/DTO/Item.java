package DTO;

import java.util.Scanner;

public class Item {

    private String itemType;
    private int value;
    private String creator;

    public Item() {
        setItemType("Item");
    }

    public Item(int value, String creator) {
        setItemType("Item");
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return itemType;
    }
    
    
    
    //INPUT

    public void input() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        //VALUE
        do {
            try {
                System.out.print("Value: ");
                value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Value is not valid!");
            }
        } while (!isValid);
        //CREATOR
        isValid = false;
        do {
            try {
                System.out.print("Creator: ");
                creator = scanner.nextLine();
                if (creator.isEmpty()) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Creator is not valid!");
            }

        } while (!isValid);

    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}
