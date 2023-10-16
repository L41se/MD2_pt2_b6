package Point_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println();

        point = new Point(2, 3);
        System.out.println(point);

        Moveable_Point movablePoint = new Moveable_Point();
        System.out.println(movablePoint);
        movablePoint = new Moveable_Point(1, 2, 3, 4);
        System.out.println(movablePoint);

        movablePoint.setSpeed(3, 5);
        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}
