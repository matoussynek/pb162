/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.muni.fi.pb162.geometry;

/**
 *
 * @author Matous Synek
 */
public class Vertex2D {
    private double x,y;
    
    /**
     * nastavi param x
     * @param x 
     */
    public void setX(double x){
        this.x = x;
    }
    /**
     * nastavi param y
     * @param y 
     */
    public void setY(double y){
        this.y = y;
    }
    /**
     * vrati hodnotu param x
     * @return x
     */
    public double getX(){
        return x;
    }
    /**
     * vrati hodnotu param y
     * @return y
     */
    public double getY(){
        return y;
    }
    /**
     * 
     * @return info 
     */
    public String getInfo(){
        return "[" + x +", " + y + "]";
    }
    /**
     * 
     * @return sum of coordinates
     */
    public double sumCoordinates(){
        return x+y;
    }
    /**
     * 
     * @param v 
     */
    public void move(Vertex2D v){
        x+=v.getX();
        y+=v.getY();
    }
    
}
