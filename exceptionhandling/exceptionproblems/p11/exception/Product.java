package exceptionhandling.exceptionproblems.p11.exception;

public class Product {
	int proId;
	String proName;
	double proPrice;
	int proQuant;
	
	public Product(int proId, String proName, double proPrice, int proQuant) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proQuant = proQuant;
	}
 public void decreaseQuantity(int proQuant) throws InsufficientQuantityException
 {
	 if(this.proQuant<proQuant)
	 {
		 throw new InsufficientQuantityException("Quantity exceeded the current quantity");
	 }
	 this.proQuant-=proQuant;
 }
@Override
public String toString() {
	return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + ", proQuant=" + proQuant
			+ "]";
}

	
}
