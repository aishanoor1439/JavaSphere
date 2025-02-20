/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

/**
 *
 * @author ABC
 */
public class Mavenproject11 {

    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.setRadius(19.2);
        System.out.println("Radius:" + s.getRadius());
        s.setHeight(20.2);
        System.out.println("Height:" + s.getHeight());
        System.out.println("Surface Area:" + s.surfaceArea(19.2,20.2));
        System.out.println("Volume:" + s.volume());
    }
}
