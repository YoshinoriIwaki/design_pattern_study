package fly_weight;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HumanLetter A = new HumanLetter("A");
		takeAPhoto(A);
		HumanLetter I = new HumanLetter("I");
		takeAPhoto(I);
		HumanLetter HA = new HumanLetter("HA");
		takeAPhoto(HA);
//		HumanLetter(A2) = new HumanLetter("A2");
		takeAPhoto(A);
//		HumanLetter(I2) = new HumanLetter(I2);
		takeAPhoto(I);
		HumanLetter(YO) = new HumanLetter(YO);
		takeAPhoto(YO);
		HumanLetter(RI) = new HumanLetter(RI);
		takeAPhoto(RI);
		HumanLetter(O) = new HumanLetter(O);
		takeAPhoto(O);
		HumanLetter(MO) = new HumanLetter(MO);
		takeAPhoto(MO);
		takeAPhoto(A);
		HumanLetter(O) = new HumanLetter(O);
		takeAPhoto(O);
//		HumanLetter(I3) = new HumanLetter(I3);
		takeAPhoto(I);
	}

	private static void takeAPhoto(HumanLetter letter) {
		System.out.println(letter.getLetter());
	}
}
