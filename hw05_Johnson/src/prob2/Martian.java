package prob2;

public abstract class Martian {
	
	private int id;
	private int volume;
	
	public Martian(int id, int vol) {
		this.id = id;
		this.volume = vol;
	}
	
	public int compareTo(Martian m) {
		return 0; //TODO
	}
	
	public boolean equals(Object o) {
		return true; //TODO
	}
	
	public int getId() {
		return id;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int v) {
		this.volume = v;
	}
	
	public abstract String speak();
}
