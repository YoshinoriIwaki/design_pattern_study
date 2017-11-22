package decorator;

public class CasheNutsToppingIceCream implements IceCream {
	private IceCream ice = null;
	
	public CashewNutsToppingIceCream(IceCream ice) {
		this.ice = ice;
	}
	
	public String getName() {
		String name = "カシューナッツ";
		name += ice.getName();
		return name;
	}
	
	public String howSweet() {
		return ice.howSweet();
	}
}
