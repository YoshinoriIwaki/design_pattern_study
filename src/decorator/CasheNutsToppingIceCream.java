package decorator;

public class CasheNutsToppingIceCream implements IceCream {
	private IceCream ice = null;
	
	public CashewNutsToppingIceCream(IceCream ice) {
		this.ice = ice;
	}
	
	public String getName() {
		String name = "�J�V���[�i�b�c";
		name += ice.getName();
		return name;
	}
	
	public String howSweet() {
		return ice.howSweet();
	}
}
