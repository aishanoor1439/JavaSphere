
package com.mycompany.mavenproject11;

import java.util.Scanner;

//Class Definition
public class Sphere {
    
//    Attributes
    private double radius;
    private double height;

//  Methods   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double surfaceArea(double radius, double height){
        return 4*3.14*radius*radius;
    }
    
    public double volume(){
        return 3/4*((3.14)*radius*radius*radius);
    }
}
