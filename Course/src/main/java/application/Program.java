package application;

import entities.Product;

public class Program {
    static void main(){
        Product product = new Product();

        IO.println("Enter Product data: " );
        product.name = IO.readln("Name: ");

        product.price = Double.parseDouble(IO.readln("Price: "));
        product.quantity = Integer.parseInt(IO.readln("Quantity in stock: "));

        IO.println(product.name + ", " + product.price + ", " + product.quantity);
    }
}
