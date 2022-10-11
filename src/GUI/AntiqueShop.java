package GUI;

import DTO.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AntiqueShop {

    private static byte inputIndex(int max) {
        Scanner scanner = new Scanner(System.in);
        byte x = 0;
        boolean isValid = false;
        do {
            try {
                System.out.print("Index: ");
                x = Byte.parseByte(scanner.nextLine());
                if (x >= max) {
                    throw new Exception();
                }
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Value isn't valid");
            } catch (Exception e) {
                x = -1;
                isValid = true;
            }
        } while (!isValid);
        return x;
    }

    public static void main(String[] args) {
        String options[] = {
            "Create a new vase",
            "Create a new statue",
            "Create a new painting",
            "Display all the items",
            "Find the items by creator",
            "Update item by its index",
            "Remove item by its index",
            "Display list of vase",
            "Sort items in ascending order based on their values",
            "Exit"
        };
        ArrayList<Item> itemsList = new ArrayList<>();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1: {
                    Item item = new Vase();
                    ((Vase) item).inputVase();
                    itemsList.add(item);
                    break;
                }
                case 2: {
                    Item item = new Statue();
                    ((Statue) item).inputStatue();
                    itemsList.add(item);
                    break;
                }
                case 3: {
                    Item item = new Painting();
                    ((Painting) item).inputPainting();
                    itemsList.add(item);
                    break;
                }
                case 4: {
                    if (!itemsList.isEmpty()) {
                        System.out.println("=================");
                        for (int i = 0; i < itemsList.size(); i++) {
                            Item o = itemsList.get(i);
                            System.out.println("[" + i + "]" + o.getItemType());
                            switch (o.getItemType()) {
                                case "Vase": {
                                    ((Vase) o).outputVase();
                                    break;
                                }
                                case "Statue": {
                                    ((Statue) o).outputStatue();
                                    break;
                                }
                                case "Painting": {
                                    ((Painting) o).outputPainting();
                                    break;
                                }
                                default: {
                                    o.output();
                                }
                            }
                            System.out.println("");
                        }

                    } else {
                        System.out.println("You need to create an item");
                    }
                    break;
                }
                case 5: {
                    //NHAP CREATOR
                    boolean isValid = false;
                    String creator = "";
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
                    //TIM THEO CREATOR
                    byte count = 0;
                    for (int i = 0; i < itemsList.size(); i++) {
                        Item o = itemsList.get(i);
                        if (o.getCreator().equals(creator)) {
                            count++;
                            System.out.println("[" + i + "]" + o.getItemType());
                            switch (o.getItemType()) {
                                case "Vase": {
                                    ((Vase) o).outputVase();
                                    break;
                                }
                                case "Statue": {
                                    ((Statue) o).outputStatue();
                                    break;
                                }
                                case "Painting": {
                                    ((Painting) o).outputPainting();
                                    break;
                                }
                                default: {
                                    o.output();
                                }
                            }
                        }
                        if (count == 0) {
                            System.out.println("Creator is not exist in the list");
                        }
                        System.out.println("");

                    }
                }
                case 6: {
                    byte i = inputIndex(itemsList.size());
                    if (i == -1) {
                        System.out.println("Item not found!");
                        break;
                    }
                    Item o = itemsList.get(i);
                    System.out.println("[" + i + "]" + o.getItemType());
                    switch (o.getItemType()) {
                        case "Vase": {
                            ((Vase) o).inputVase();
                            break;
                        }
                        case "Statue": {
                            ((Statue) o).inputStatue();
                            break;
                        }
                        case "Painting": {
                            ((Painting) o).inputPainting();
                            break;
                        }
                        default: {
                            o.input();
                        }
                    }
                    System.out.println("Item have been updated");
                    break;
                }
                case 7: {
                    byte i = inputIndex(itemsList.size());
                     if (i == -1) {
                        System.out.println("Item not found!");
                        break;
                    }
                     itemsList.remove(i);
                     System.out.println("Item have been removed");
                     break;
                }
            }

        } while (choice < 10 && choice > 0);
    }
}
