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
public class BaiToanHinhHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.4);
        System.out.println("p1: "+ p1.toString());
        p1.setXY(5.3, 1.2);
        System.out.println("p1 after update: "+ p1.toString());
        Point c2 = new Point(1.2, 6);
        Circle c1 = new Circle(c2, 10);
        System.out.println("c1 infor: "+ c1.toString());
        
        c1.setRadius(100);
        System.out.println("c1 infor: "+ c1.toString());
        
        
        
    }
    
}
