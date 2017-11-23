package memento;
import java.util.*;


public class Wadayama {

	private static Map<String, Calc.Memento> map = new HashMap<String, Calc.Memento>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		
		for(int n = 1; n <= 5; n++) {
			calc.plus(n);
		}
		System.out.println(calc.getTemp());
		map.put("5‚Ü‚Å‚Ì‘«‚µŽZ", calc.createMemento());
		
		Calc calc2 = new Calc();
		calc2.setMemento(map.get("5‚Ü‚Å‚Ì‘«‚µŽZ"));
		
		for(int n = 6; n <= 10; n++) {
			calc2.plus(n);
		}
		
		System.out.println(calc2.getTemp());
		map.put("10‚Ü‚Å‚Ì‘«‚µŽZ", calc2.createMemento());
	}

}
