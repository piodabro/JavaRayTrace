/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.umk.raytracking.utility;

/**
 *
 * @author Szymon
 */
public class Point2D {
    public double x,y;

    public Point2D() {
        x = 0.0;
        y = 0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D sub(double scalar){
        return new Point2D(x*scalar, y*scalar);
    }
    
    
}
