package prob1;

public class Warehouse {

	protected int numItems;
	private Item[] items = new Item[10];
	
	public Warehouse() {}
	
	public void addItem(Item item) {
		if(numItems > 0 && numItems < items.length) {
			items[numItems++] = item;
		}
		
	}
	
	public Item getItem(int i) {
		if(i > 0 && i < numItems)
			return items[i];
		else
			return null;
	}
	
	public Item getItem(String name) {
		for(int i = 0; i < numItems; i++) {
			if(items[i].getName().equals(name)) {
				return items[i];
			}
		}
		return null;
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public double getAverageTemp() {
		
	}
	
	public RefridgeratedItem[] getRefridgeratedITem() {
		
	}
	
	public double getTotalCost() {
		double totCost = 0;
		for(int i = 0; i < numItems; i++) {
			totCost += items[i].getCost();
		}
		return totCost;
	}
	
	public double getTotalCostRefridgerated() {
		
	}
	
	public Item removeItem(String name) {
		Item removedItem = null;
		for(int i = 0; i < numItems; i++) {
			if(items[i].getName().equals(name)) {
				removedItem = items[i];
				items[i-1] = items[i];
			}
		}
		return removedItem;
		
	}
	
	public
}
