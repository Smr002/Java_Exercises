package ex_9_8;

public class Fan {

    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    boolean on = false;
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    private double radius = 5.0;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private String color = "blue";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Fan() {
    }

    public String toString() {
        if (!on) {
            return "Fan is on."+", Radius: " + radius  + ", Color :" + getColor();
        } else {
            return "Fan is off";
        }
    }
}
