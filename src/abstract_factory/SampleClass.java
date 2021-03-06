package abstract_factory;

import java.util.*;

public class SampleClass {
	public static void main(String args[]) {
		HotPot hotpot = new Hotpot(new Pot());
		Factory factory = createFactory(args[0]);
		hotpot.addSoup(factory.getSoup());
		hotpot.addMain(factory.getMain());		
		hotpot.addVegetables(factory.getVegetables());
		hotpot.addOtherIngredients(factory.getOtherIngredients());
	}
	
	private static Factory createFactory(String str) {
		if("キムチ鍋".equals(str)) {
			return new KimuchFactory();
		} else if("すき焼き".equals(str)) {
			return new SukiyakiFactory();
		} else {
			return new MizutakiFactory();
		}
	}
}
