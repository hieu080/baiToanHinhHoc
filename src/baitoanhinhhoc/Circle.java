/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitoanhinhhoc;

/**
 *
 * @author HELLO
 */
public class Circle {
    private Point center;
    private double radius;
    
    public Circle(){
        center = new Point();
        radius = 0.0;
    }
    public Circle(double k){
        center = new Point();
        radius = k;
    }
    public Circle(Point c){
        center = c;
        radius = 0.0;
    }
    public Circle(Point c, double k){
        center = c;
        radius = k;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getPerimater(){
        double result = Math.PI*2*this.radius;
        return result;
    }
    public double getArea(){
        double result = Math.PI*this.radius*this.radius;
        return result;
    }
    public int relativePosition(Point p){
        double result = Math.sqrt((Math.pow(p.getX() - center.getX(),2) + (Math.pow(p.getY() - center.getY(),2))));
        if( result < radius){
            return 1;
        }
        else if(result == radius){
            return 0;
        }
        else 
            return -1;
    }

    @Override
    public String toString() {
        String result = "";
        result += "center: " + this.center;
        result += ", radius: " + this.radius;
        result += ", perimeter: " + this.getPerimater();
        result += ", area: " + this.getArea();
        result += ", relativePosition: "+ this.relativePosition(center);
        return result;
        //return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
}
