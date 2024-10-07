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
public class Vase extends Item{
    private int height;
    private String material;

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase() {
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
        input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter height: ");
            height = sc.nextInt();
            if(height <= 0) throw new Exception("Height must be positive.");
            sc.nextLine(); // consume newline
            System.out.print("Enter material: ");
            material = sc.nextLine();
            if(material.isEmpty()) throw new Exception("Material can't be empty.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    
    
}