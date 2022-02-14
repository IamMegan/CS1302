package prob1;

public class RefridgeratedItem extends Item{

	protected double temp;
	
	public RefridgeratedItem(String name, double weight, double temp) {
		super(name, weight);
		this.temp=temp;
		
	}
	
	public RefridgeratedItem(Item item, double temp) {
		
		super(item.getName(), item.getWeight());
		
	}
	
}
