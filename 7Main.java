import java.util.Scanner;

class Circle {
    double radius;
    String color;

    Circle() {
        radius = 1.0;
        color = "blue";
    }

    Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder() {
        super();
        height = 2.0;
    }

    Cylinder(double height) {
        super();
        this.height = height;
    }

    Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    double getArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    double getVolume() {
        return super.getArea() * height;
    }

    void display() {
        System.out.println("Radius is " + super.radius + ", Height is " + height +
            ", Color is " + super.color + ", Area is " + getArea() +
            ", Volume is " + getVolume());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cylinder[] c = new Cylinder[4];
        c[0] = new Cylinder();
        c[1] = new Cylinder();
        c[2] = new Cylinder(3.0, 4.0, "Green");
        c[3] = new Cylinder(3.0, 5.0, "Red");

        for (int i = 0; i < c.length; i++) {
            System.out.println("Cylinder " + (i + 1) + ":");
            c[i].display();
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].getRadius() == c[j].getRadius() && c[i].getColor().equalsIgnoreCase(c[j].getColor())) {
                    System.out.println("Cylinder " + (i + 1) + " and Cylinder " + (j + 1) + " are similar.");
                }
            }
        }
    }
}
