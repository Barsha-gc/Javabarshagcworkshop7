package javaweek7;

public class Product {

    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public void getDetails() {
        System.out.println(name + " - Rs." + price);
    }

    public boolean checkAvailability() {
        return stockQuantity > 0;
    }

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
}
