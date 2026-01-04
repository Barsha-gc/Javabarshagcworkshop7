package javaweek7;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String password;

    public void register() {
        System.out.println("Customer registered");
    }

    public void login() {
        System.out.println("Customer logged in");
    }

    public void viewProducts() {
        System.out.println("Products listed");
    }

    public void addToCart() {
        System.out.println("Product added to cart");
    }

    public void checkout() {
        System.out.println("Checkout complete");
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
