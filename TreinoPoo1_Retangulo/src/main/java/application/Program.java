package application;

import entities.Rectangle;

public class Program{
    static void main(){
        Rectangle rectangle = new Rectangle();

        IO.println("Enter rectangle width and height: ");

        rectangle.height = Double.parseDouble(IO.readln());
        rectangle.width = Double.parseDouble(IO.readln());

        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.printf("PERIMETER = %.2f", rectangle.perimetro());
        System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());
    }

}