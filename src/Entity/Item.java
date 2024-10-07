/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author kan3v
 */

public class Item {
    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
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
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value: ");
            value = sc.nextInt();
            if(value <= 0) throw new Exception("Value must be positive.");
            sc.nextLine(); // consume newline
            System.out.print("Enter creator: ");
            creator = sc.nextLine();
            if(creator.isEmpty()) throw new Exception("Creator can't be empty.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}

