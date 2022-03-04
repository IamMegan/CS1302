package ver2;

public class WolfDog extends Dog {
	
	private int toughness;
	
	public WolfDog(String name, int toughness) {
		super(name);
		this.toughness = toughness;
	}
	
	@Override
	public String bark() {
		return name + " says: BARK";
	}
	
	@Override
	public String toString() {
		return "WolfDog named " + getName();
	}
	
	public int getToughness() {
		return toughness;
	}

}
