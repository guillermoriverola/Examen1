package edu.upc.eetac.dsa.griverola.examen1;

public class Product {
	   private int Code;
	   private String Name;
	   private String Manufacturer;
	   private double Price;

	   Product(int Code, String Name, double Price, String Manufacturer){
		  this.Code = Code;
		  this.Name = Name;
	      this.Price = Price;
	      this.Manufacturer = Manufacturer;
	   }

	   public int getCode() {
		  return Code;
	   }
	   
	   public void setCode(int Code) {
		 this.Code = Code;
	   }
	   
	   public String getName() {
	      return Name;
	   }

	   public void setName(String Name) {
	      this.Name = Name;
	   }

	   public double getPrice() {
	      return Price;
	   }

	   public void setPrice(int Price) {
	      this.Price = Price;
	   }
	   
	   public String getManufacturer() {
		  return Manufacturer;
	   }

	   public void setManufacturer(String Manufacturer) {
		 this.Manufacturer = Manufacturer;
	   }
	}