package class_and_projects;

public class SimpleCircle {
    double radius;
    SimpleCircle(){
        radius = 1;
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius*radius* Math.PI;
    }
    double getPerimeter(){
        return 2*radius* Math.PI;
    }
    void setNewRadius(double newRadius){
        radius = newRadius;
    }
}
