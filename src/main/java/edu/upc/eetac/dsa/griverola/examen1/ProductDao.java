package edu.upc.eetac.dsa.griverola.examen1;


import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	
   //list is working as a database
   List<Product> products;

   public ProductDao(){
	  products = new ArrayList<Product>();
	  Product product1 = new Product(1,"Hard drive",240,"Sony");
	  Product product2 = new Product(2,"Memory",120,"Creative Labs");
	  Product product3 = new Product(3,"ZIP drive",150,"Fujitsu");
	  Product product4 = new Product(4,"Floppy disk",5,"Winchester");
	  products.add(product1);
	  products.add(product2);
	  products.add(product3);
	  products.add(product4);
	  
   }
   public void deleteProduct(Product product) {
	  products.remove(product.getCode());
      System.out.println("Product: Code " + product.getCode() + ", deleted from database");
   }

   public List<Product> getAllProducts() {
      return products;
   }

   public Product getProduct(int Code) {
      return products.get(Code);
   }

   public void updateProduct(Product product) {
	  products.get(product.getCode()).setName(product.getName());
      System.out.println("Product: Code " + product.getCode() + ", updated in the database");
   }
}