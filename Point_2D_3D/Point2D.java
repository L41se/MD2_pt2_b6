package Point_2D_3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;

    }
    public float [] getXY(){
        float [] f = new float[2];//tao mang voi do dai = 2
        f[0] = x;// lap bien x cho phan tu 0 cua mang
        f[1] = y;// lap bien y cho phan tu 1 cua mang
        return f;//tra ve mang
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
