package application;

import entities.Product;

public class Program {
    static void main(){
        Product product = new Product();

        IO.println("Enter Product data: " );
        product.name = IO.readln("Name: ");

        product.price = Double.parseDouble(IO.readln("Price: "));
        product.quantity = Integer.parseInt(IO.readln("Quantity in stock: "));

        IO.println();
        IO.println("Product data: " + product);

        IO.println();
        IO.println("Enter the number of products to be added in stock: ");

        int quantity = Integer.parseInt(IO.readln());
        product.addProduct(quantity);

        IO.println();
        IO.println("Updated data: " + product);

        IO.println();
        IO.println("Enter the number of products to be removed from stock: ");
        quantity = Integer.parseInt(IO.readln());
        product.removeProduct(quantity);

        IO.println();
        IO.println("Updated data: " + product);

    }
}
