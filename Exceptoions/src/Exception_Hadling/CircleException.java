package Exception_Hadling;

public class CircleException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    //    Setting up new Radius
    public void setRadius(double newRadius) {

        if (newRadius >= 0) {
            radius = newRadius;
        } else
            throw new IllegalArgumentException("Radius Cannot be a negative\n");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    public double findArea(){
        return  radius*radius* Math.PI;
    }
}

