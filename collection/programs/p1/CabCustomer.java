package collection.programs.p1;

public class CabCustomer {
	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distnce;
	private String phone;
	
 public CabCustomer()
 {
	 
 }
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distnce,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distnce = distnce;
		this.phone = phone;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistnce() {
		return distnce;
	}
	public void setDistnce(int distnce) {
		this.distnce = distnce;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
