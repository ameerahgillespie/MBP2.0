public class Product {
    private String name;
    private String description;
    private String category;
    private String price;
    
//    public Product(Scanner file) {
//        name = file.nextLine();
//        description = file.nextLine();
//        category = file.nextLine();
//        price = Double.parseDouble(file.nextLine());
//    }
    
    public Product(String name, String description, String category, String price) {
        this.name = name;   
        this.description = description;
        this.category = category;
        this.price = price;
    }

	public Product(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    public String toString() {
        String ret = "";
        
        ret += "Name: " + name + "\n";
        ret += "Description: " + description + "\n";
        ret += "Category: " + category + "\n";
        ret += "Price: " + price + "\n";
        
        return ret;
    }

    public String addProduct(String line) {
    		return line;
    }
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
