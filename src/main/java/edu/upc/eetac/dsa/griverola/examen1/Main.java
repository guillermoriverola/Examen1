package edu.upc.eetac.dsa.griverola.examen1;

public class Main {
	   public static void main(String[] args) {
	      ProductDao productDao = new ProductDao();

	      //print all product
	      for (Product product : productDao.getAllProducts()) {
	         System.out.println("Product: [Code : " + product.getCode() + ", Name : " + product.getName() + ", Price : " + product.getPrice() + ", Manufacturer : " + product.getManufacturer() + " ]");
	      }


	      //update product
	      Product product = productDao.getAllProducts().get(0);
	      product.setName("Hard drive");
	      productDao.updateProduct(product);

	      //get the product
	      productDao.getProduct(0);
	      System.out.println("Product: [Code : " + product.getCode() + ", Name : " + product.getName() + ", Price : " + product.getPrice() + ", Manufacturer : " + product.getManufacturer() + " ]");	
	   }
	}

