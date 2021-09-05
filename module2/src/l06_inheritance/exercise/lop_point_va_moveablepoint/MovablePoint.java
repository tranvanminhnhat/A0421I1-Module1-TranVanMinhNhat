package l06_inheritance.exercise.lop_point_va_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){

    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "), speed = (" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MovablePoint move(){
        setX(getX() + this.xSpeed);
        setY(getY() + this.xSpeed);
        return this;
    }
}
