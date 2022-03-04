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
	
	public RefridgeratedItem[] getRefridgeratedItems() {
		int Count = 0;
		RefridgeratedItem[] refItems;
		
		for(int i = 0; i < numItems; i++) {
			if(items[i] instanceof RefridgeratedItem) {
				Count++;
			}
		}
		refItems = new RefridgeratedItem[Count];
		
		for(int i = 0; i < numItems; i++) {
			if(items[i] instanceof RefridgeratedItem) {
				refItems[i] = (RefridgeratedItem)items[i];
			}
		}
		return refItems;
	}
	
	public double getTotalCost() {
		double totCost = 0;
		for(int i = 0; i < numItems; i++) {
			totCost += items[i].cost();
		}
		return totCost;
	}
	
	public double getTotalCostRefridgerated() {
		int totCost = 0;
		for(int i = 0; i < numItems; i++) {
			if(items[i] instanceof RefridgeratedItem) {
				totCost += items[i].cost();
			}
		}
		return totCost;
		
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
	
	//public
}
