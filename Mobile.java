package edu.mce.john.mobilestore.models;

public class Mobile {
	private Long id;
	private String brand;
	private String owner;
	private Double price;
	
	static Long nextId;
	
	static {
		nextId = 2001L;
	}
	
	public Mobile() {
		this.id = nextId;
		this.brand="Empty";
		this.owner="Empty";
		this.price=0.00;
		nextId++;
	}
	public Mobile(String brand, String owner, Double price) {
		this.id = nextId;
		this.brand=brand;
		this.owner=owner;
		this.price=price;
		nextId++;
	}
	public Mobile(Mobile mb) {
		this.id = nextId;
		this.brand=mb.brand;
		this.owner=mb.owner;
		this.price=mb.price;
		nextId++;
	}
	
	public Long getId() {
		return this.id;
	}
	public String getBrand() {
		return this.brand;
	}
	public String getOwner() {
		return this.owner;
	}
	public Double getPrice() {
		return this.price;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
