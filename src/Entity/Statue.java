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
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
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
        input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter weight: ");
            weight = sc.nextInt();
            if(weight <= 0) throw new Exception("Weight must be positive.");
            sc.nextLine(); // consume newline
            System.out.print("Enter colour: ");
            colour = sc.nextLine();
            if(colour.isEmpty()) throw new Exception("Colour can't be empty.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
