package prob1;

public class Item {

	protected String name;
	protected double weight;
	
	public Item(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double cost() {
		return weight*2;
	}
	@Override
	public String toString() {
		return String.format("name = %s, cost=$%0.2f, weight=%0.2f", name, cost(), weight);
	}
}
