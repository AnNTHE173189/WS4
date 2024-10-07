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

public class Painting extends Item{
    private String paintType;
    private String frameMaterial;

    public Painting(String paintType, String frameMaterial, int value, String creator) {
        super(value, creator);
        this.paintType = paintType;
        this.frameMaterial = frameMaterial;
    }

    public Painting() {
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter paint type: ");
            paintType = sc.nextLine();
            if(paintType.isEmpty()) throw new Exception("Paint type can't be empty.");
            System.out.print("Enter frame material: ");
            frameMaterial = sc.nextLine();
            if(frameMaterial.isEmpty()) throw new Exception("Frame material can't be empty.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void outputPainting() {
        output();
        System.out.println("Paint Type: " + paintType);
        System.out.println("Frame Material: " + frameMaterial);
    }

    

}
