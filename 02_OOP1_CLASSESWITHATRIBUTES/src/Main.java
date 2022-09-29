
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(0, "Laptop","Asus Laptop" , 3600);
		//Constructor with parameters
		product.setId(0);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(20);
		product.getId();
		product.setId(23);
		System.out.println(product.getDescription());
		
		ProductManager productmanager=new ProductManager();
		
		productmanager.Add(product);
		productmanager.Add2(23, "Camera", "Kodak", 3500);
	}

}
