package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return height * width;
    }
    public double perimetro(){
        return (height + width) * 2;
    }
}
