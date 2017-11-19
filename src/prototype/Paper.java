package prototype;

public class Paper implements Cloneable {
	private String name;
	public Paper() {}
	public Paper(Strint name) {
		this.name = name;
	}

	public Cloneable createClone() {
		Paper newPaper = new Paper();
		newPaper.name = this.name;
		return newPaper;
	}
}
