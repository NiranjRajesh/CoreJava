package agreggator;

public class Item implements Comparable<Item>{

	private String name;
	private Double price;
	private String type;
	
	public Item() {
		
	}
	
	public Item(String name, Double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	static Item createItem(String detail) {
		String arr[]=detail.split(",");
		
		return new Item(arr[0],Double.parseDouble(arr[1]),arr[2]);
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return String.format("%-20s %-10.1f %-12s\n",this.getName(),this.getPrice(),this.getType());
	}
	
	
}
