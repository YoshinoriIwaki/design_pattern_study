package command;

public class Beaker {
	private double water = 0;
	private double salt = 0;
	private boolean melted = true;
	
	public static final int ADD_SALT = 1;
	public static final int ADD_WATER = 2;
	public static final int MAKE_SALT_WATER = 3;
	
	public Beaker(double water, double salt) {
		this.water = water;
		this.salt = salt;
		this.mix();
	}
	
//	public void experiment(int param) {
//		if(param == ADD_SALT) {
//			while(isMelted()) {
//				this.addSalt(1);
//				this.mix();
//			}
//			
//			System.out.println("食塩を1gずつ加える実験");
//			this.note();
//		} else if(param == ADD_WATER) {
//			while(!isMelted()) {
//				this.addWater(10);
//				this.mix();
//			}
//			System.out.println("水を10ずつ加える実験");
//			this.note();
//		} else if(param == MAKE_SALT_WATER) {
//			this.mix();
//			System.out.println("食塩を作る実験");
//			this.note();
//		}
//	}
	
	public void addSalt(double salt) {
		this.salt += salt;
	}
	
	public void addWater(double water) {
		this.water += water;
	}
	
	public void mix() {
		if((this.salt / (this.salt + this.water)) *100 < 26.4) {
			melted = true;
		} else {
			melted = false;
		}
	}
	
	public double getSalt() {
		return salt;
	}
	
	public double getWater() {
		return water;
	}
	
	public boolean isMelted() {
		return melted;
	}
	
	public void note() {
		System.out.println("水:" + water + "g");
		System.out.println("食塩" + salt + "g");
		System.out.println("濃度:" + (salt / (water + salt)) * 100 + "%");
	}
}
