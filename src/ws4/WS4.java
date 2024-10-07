/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws4;

import Entity.Item;
import Entity.Painting;
import Entity.Statue;
import Entity.Vase;
import java.util.Scanner;

/**
 *
 * @author kan3v
 */
public class WS4 {

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Choose 1.." + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }

    public static void main(String[] args) {
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the item"};
        Item item = null;
        int choice;

        do {
            choice = getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an item first.");
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
