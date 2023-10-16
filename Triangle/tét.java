package Triangle;

public class tét {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("red",false);
        System.out.println(shape1);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(1,2,3);
        System.out.println(triangle1);
    }
}
