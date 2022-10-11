package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        setItemType("Painting");
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        setItemType("Painting");
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
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
        //WIDTH
        isValid = false;
        do {
            try {
                System.out.print("Width: ");
                width = Integer.parseInt(scanner.nextLine());
                if (width <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Width is not valid!");
            }
        } while (!isValid);
        //ISWATERCOLOUR
        isValid = false;
        do {
            try {
                System.out.print("Is water color? ");
                String s;
                s = scanner.nextLine();
                if (s.isEmpty()) {
                    throw new Exception();
                }
                
                switch (s.toUpperCase()) {
                    case "YES":
                        isWatercolour = true;
                        break;
                    case "NO":
                        isWatercolour = false;
                        break;
                    default:
                        throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Entered value is not valid!");
            }
        } while (!isValid);
        //ISFRAMED
        isValid = false;
        do {
            try {
                System.out.print("Is framed? ");
                String s = scanner.nextLine();
                if (s.isEmpty()) {
                    throw new Exception();
                }
                switch (s.toUpperCase()) {
                    case "YES":
                        isFramed = true;
                        break;
                    case "NO":
                        isFramed = false;
                        break;
                    default:
                        throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Entered value is not valid!");
            }
        } while (!isValid);
    }

    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        //YES|NO
        System.out.println("Is water colour: " + (isWatercolour ? "Yes" : "No"));
        System.out.println("Is framed: " + (isFramed ? "Yes" : "No"));
    }
}
