package exceptionhandling.exceptionproblems.p11.exception;

import java.util.Scanner;

public class ShoppingApplication {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        
        sc.nextLine(); 
        
        ShoppingCart shop = new ShoppingCart(numberOfProducts);

        for (int i = 0; i < numberOfProducts; i++) {
        	
            System.out.println("Enter details for product no " + (i + 1)); //display the product number

            System.out.print("Product ID: "); //take the product id
            int id = sc.nextInt();
            
            sc.nextLine(); 

            System.out.print("Product Name: "); //product name
            String name = sc.nextLine();

            System.out.print("Product Price: ");  //product price
            double price = sc.nextDouble();

            System.out.print("Product Quantity: "); // product quantity
            int quantity = sc.nextInt();
            sc.nextLine(); 

            Product p = new Product(id, name, price, quantity); // will create a new product object(product to add in cart)
            shop.addToCart(p, quantity); //will add to the cart
        }

        System.out.println("Total Cost: " + shop.calculateTotal()); //display the total bill

        sc.close();
    }
}
