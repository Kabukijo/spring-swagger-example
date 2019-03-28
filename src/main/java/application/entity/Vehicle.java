package application.entity;

public class Vehicle {

	private String id;
	private String brand;
	private String color;
	private Integer year;

	public Vehicle(String id, String brand, String color, Integer year) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", color=" + color + ", year=" + year + "]";
	}

}
