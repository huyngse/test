
package GUI;

import java.util.Scanner;

public class Menu {
    public static int getChoice(String[] options) {
        System.out.println("");
        System.out.println("================");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Choose 1.." + options.length + ": ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
