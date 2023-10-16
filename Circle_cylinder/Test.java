package Circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3.5);
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3.5, 2.5, "red");
        System.out.println(cylinder);
    }

}
