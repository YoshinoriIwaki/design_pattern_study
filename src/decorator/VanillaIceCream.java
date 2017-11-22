package decorator;

public class VanillaIceCream implements IceCream {
	public String getName() {
		return "バニラクリーム";
	}
	
	public String howSweet() {
		return "バニラ味";
	}
}
