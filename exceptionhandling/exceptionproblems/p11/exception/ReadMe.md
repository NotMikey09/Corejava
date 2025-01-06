# Simple Shopping Application

## Inside the Code

### Custom Exceptions
1. **InsufficientQuantityException**: 
   - **Type**: Checked Exception
   - **Constructor**: `InsufficientQuantityException(String message)`
   - **Purpose**: Thrown when the requested quantity of a product is not available.

2. **InvalidProductException**: 
   - **Type**: Unchecked Exception
   - **Constructor**: `InvalidProductException(String message)`
   - **Purpose**: Thrown when a product is not found in the inventory.

### Product Class
- **Attributes**:
  - `int id`: Unique identifier for the product.
  - `String name`: Name of the product.
  - `double price`: Price of the product.
  - `int quantity`: Available quantity of the product.

- **Constructor**: 
  ```java
  public Product(int id, String name, double price, int quantity) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.quantity = quantity;
  }
Methods:

decreaseQuantity:

java
public void decreaseQuantity(int amount) throws InsufficientQuantityException {
    if (amount > this.quantity) {
        throw new InsufficientQuantityException("Not enough quantity available.");
    }
    this.quantity -= amount;
}
ShoppingCart Class
Attributes:

Product[] cartItems: Array to store items in the cart.

int itemCount: Number of items in the cart.

int k: Helper variable.

Constructor:

java
public ShoppingCart(int capacity) {
    this.cartItems = new Product[capacity];
    this.itemCount = 0;
}
Methods:

addToCart:

java
public void addToCart(Product product, int quant) {
    int k = 1;
    try {
        if (product == null) {
            throw new InvalidProductException("Product cannot be null!!");
        } else if (itemCount < cartItems.length) {
            for (int i = 0; i < cartItems.length; i++) {
                if (cartItems[i] != null) {
                    if (cartItems[i].proId == product.proId) {
                        k = 0;
                        if (cartItems[i].proQuant > quant) {
                            cartItems[i].proQuant += quant;
                            product.decreaseQuantity(quant);
                            break;
                        } else {
                            throw new InsufficientQuantityException("Quantity is not sufficient");
                        }
                    }
                }
            }
            if (k == 1) {
                cartItems[itemCount++] = new Product(product.proId, product.proName, product.proPrice, quant);
            }
        }
    } catch (InsufficientQuantityException e) {
        System.out.println(e.getMessage());
    } catch (InvalidProductException e) {
        System.out.println(e.getMessage());
    }
}
Description: The addToCart method adds a product to the cart. It checks if the product is null, if the cart has enough capacity, and if the product already exists in the cart. If the product exists, it updates the quantity. If not, it adds the product to the cart. The method also handles exceptions for invalid products and insufficient quantity.

calculateTotal:

java
public double calculateTotal() {
    double price = 0;
    for (Product p : cartItems) {
        if (p != null) {
            price += p.proPrice * p.proQuant;
        }
    }
    return price;
}
Description: The calculateTotal method calculates and returns the total price of all items in the cart. It iterates through the cartItems array, multiplying the price and quantity of each product to get the total cost.

ShoppingApplication Class
Main Method: Demonstrates the shopping application's functionality.

java
public class ShoppingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        ShoppingCart shop = new ShoppingCart(numberOfProducts);

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter details for product no " + (i + 1));
            
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Product Price: ");
            double price = sc.nextDouble();

            System.out.print("Product Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product p = new Product(id, name, price, quantity);
            shop.addToCart(p, quantity);
        }

        System.out.println("Total Cost: " + shop.calculateTotal());
        sc.close();
    }
}
Description: The main method initializes the shopping application. It prompts the user to enter the number of products and their details, creates a ShoppingCart object, and adds products to the cart. Finally, it calculates and displays the total cost of the items in the cart.