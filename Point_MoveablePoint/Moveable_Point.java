package Point_MoveablePoint;

public class Moveable_Point extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Moveable_Point() {
    }

    public Moveable_Point(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
    }

    public float[] getSpeed() {
        float[] f = new float[2];
        f[0] = xSpeed;
        f[1] = ySpeed;
        return f;
    }

    @Override
    public String toString() {
        return "Moveable_Point{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public Moveable_Point move() {
        setXY(getX() + xSpeed, getY() + ySpeed);// khi muon thay doi thi dung set
        return this;
    }
}
