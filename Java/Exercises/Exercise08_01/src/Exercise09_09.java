/*
(Geometry: n-sided regular polygon) 
In an n-sided regular polygon, all sides have the same length and all angles 
have the same degree (i.e., the polygon is both equilateral and equiangular).

Design a class named RegularPolygon that contains:
- A private int data field named n that defines the number of sides in the 
polygon with default value 3.

- A private double data field named side that stores the length of the side 
with default value 1.

- A private double data field named x that defines the x-coordinate of the 
polygon’s center with default value 0.

- A private double data field named y that defines the y-coordinate of the 
polygon’s center with default value 0.

- A no-arg constructor that creates a regular polygon with default values.

- A constructor that creates a regular polygon with the specified number of 
sides and length of side, centered at (0, 0).

- A constructor that creates a regular polygon with the specified number of 
sides, length of side, and x- and y-coordinates.

- The accessor and mutator methods for all data fields.

- The method getPerimeter() that returns the perimeter of the polygon.

- The method getArea() that returns the area of the polygon.

The formula for computing the area of a regular polygon is:
Area = n * s^2 / (4 * tan(pi / n))

Draw the UML diagram for the class and then implement the class.

Write a test program that creates three RegularPolygon objects, created 
using the no-arg constructor, using RegularPolygon(6, 4), and using 
RegularPolygon(10, 4, 5.6, 7.8).

For each object, display its perimeter and area.

Sample Run
Polygon 1 perimeter: 3.0
Polygon 1 area: 0.43301270189221946
Polygon 2 perimeter: 24.0
Polygon 2 area: 41.569219381653056
Polygon 3 perimeter: 40.0
Polygon 3 area: 123.10734148701015
 */
import java.lang.Math;

public class Exercise09_09 {
    public static void main(String[] args) {
        
    }    
}
class RectangularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RectangularPolygon(){    
    }

    RectangularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    RectangularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    void setN (int n)){
        this.n = n;
    }

    void setSide (double side)){
        this.side = side;
    }

    void setX (double x)){
        this.x = x;
    }

    void setY (double y)){
        this.y = y;
    }

    double getArea(){
        return height * width;
    }

    double getPerimeter(){
        return (height + width) * 2;
    }      
}