package Circle_cylinder;

public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){

    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(double volume) {
        return super.getArea() * volume;
    }
}
