package l06_inheritance.exercise.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr= {getX(),getY(), this.getZ()};
        return arr;
    }

    @Override
    public String toString(){
        return "coordinates x: " + getX() +"\n"
                + "coordinates y: " + getY() + "\n"
                + "coordinates z: " + this.getZ();
    }
}
