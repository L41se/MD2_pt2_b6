package Point_2D_3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;

    }
    public float [] getXYZ(){
        float [] f1 = new float[3];
        f1[0] = getX();
        f1[1] = getY();
        f1[2] = z;
        return f1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" +getX() +
                "y=" +getY() +
                "z=" + z +
                '}';
    }
}
