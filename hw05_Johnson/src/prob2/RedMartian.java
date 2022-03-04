package prob2;

public class RedMartian extends Martian{
	
	private int tenacity;
	
	public RedMartian(int id, int vol, int ten) {
		super(id, vol);
		this.tenacity = ten;
		
	}
	
	public RedMartian(int id, int ten) {
		this(id, 0, ten);
	}
	
	public int getTenacity() {
		return tenacity;
	}
	
	public String speak() {
		return null; //TODO
	}
	
	public String toString() {
		return null;
	}

}
