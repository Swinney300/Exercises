/*Please note that you have to put all code in one file in order to submit to REVEL. Your program should have 
no package statement. The outline of the program may look like this:

Area is 95.03317777109125
Perimeter is 34.55751918948772
c1 contains point (3, 3)? true
c1 contains circle Circle2D(4, 5, 10.5)? false
c1 overlaps circle Circle2D(3, 5, 2.3)? true
*/

public class Exercise10_11 {

    public static void main(String[] args) {
        // Write your code
    }
}

class Circle2D {
    // Write your code
    private double radius = 1;
    private int[] location = new int[2];
    private int x = location[0];
    private int y = location[1];

    Circle2D() {
        radius = 1;
        x = 0;
        y = 0;
    }

    Circle2D(double radius) {
        setRadius(radius);
        x = 0;
        y = 0;
    }

    Circle2D(double radius, int x, int y) {
        this.radius = radius;
        setLocation(x, y);
    }

    public boolean contains() {

    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    int[] getLocation() {
        return location;
    }

    void setLocation(int x, int y) {
        location[0] = x;
        location[1] = y;
    }
}
