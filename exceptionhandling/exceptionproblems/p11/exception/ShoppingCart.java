package exceptionhandling.exceptionproblems.p11.exception;

public class ShoppingCart {
	
	  Product[] cartItems;
	  int itemCount;
	  int k=0;
	public ShoppingCart(int capcity) 
	{
		cartItems=new Product[capcity];
		itemCount = 0;
	}
	  
	public void addToCart(Product product,int quant) // add to cart method
	{    
		int k=1;
		try {
			
			if(product==null)
			{
				throw new InvalidProductException("Product cannt be null!!");
			}
			else if(itemCount<cartItems.length)
			{ 
				for(int i=0;i<cartItems.length;i++)
			{
				
				if(cartItems[i]!=null)
				{
				if(cartItems[i].proId==product.proId)
				{
					k=0;
					if(cartItems[i].proQuant>quant)
					{
				cartItems[i].proQuant+=quant;
				product.decreaseQuantity(quant);
				break;
					}
					else
						throw new InsufficientQuantityException("Quantity is sufficient");
				}
				}
				
			}
			if(k==1)
			{
				cartItems[itemCount++]=new Product(product.proId, product.proName, product.proPrice, quant);
			}
			}
		}
		catch (InsufficientQuantityException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidProductException e) {
			System.out.println(e.getMessage());
		}
	}
	
		public double calculateTotal()
		{
			double price=0;
		
			for(Product p:cartItems)
			{
				 price= price +(p.proPrice*p.proQuant);
			}
			return price;
			
		}
	  
	}
