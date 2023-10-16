package Circle_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + this.radius + " = r, " + this.color + " = c]";
    }
}
