package decorator;

public class GreenTeaIceCream implements IceCream {
	public String getName() {
		return "抹茶アイスクリーム";
	}
	
	public String howSweet() {
		return "抹茶味";
	}
}
