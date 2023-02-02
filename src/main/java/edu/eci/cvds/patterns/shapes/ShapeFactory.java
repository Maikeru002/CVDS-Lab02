package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;


public class ShapeFactory {
    public static Shape create(RegularShapeType shape) {
        Shape s = null;
        switch(shape){
            case Triangle:
                s = new Triangle();
                return s;
            case Hexagon:
                s = new Hexagon();
                return s;
            case Quadrilateral:
                s = new Quadrilateral();
                return s;
            case Pentagon:
                s = new Pentagon();
                return s;
        }
        return null;
    }
}
