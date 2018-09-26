package cz.muni.fi.pb162.project;

import cz.muni.fi.pb162.geometry.Vertex2D;

/**
 *
 * @author Matous Synek
 */



/**
 * Class for running main method.
 *
 * @author TODO: put your name here
 */
public class Demo {

    /**
     * Runs the code.
     *
     * @param args command line arguments, will be ignored
     */
    public static void main(String[] args) {
        
        Vertex2D a = new Vertex2D();
        Vertex2D b = new Vertex2D();
        
        a.setX(1);
        a.setY(1);
        b.setX(2);
        b.setY(2);
        a.move(b);
        System.out.println(a.getInfo());
        System.out.println(b.getInfo());
        

    }
}
