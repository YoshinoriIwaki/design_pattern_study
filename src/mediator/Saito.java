package mediator;
import java.util.*;

public class Saito implements LoveMediator {
	private Map<String, Collegue> collegueMap = new HashMap<String, Colleague>();
	
	public void addColleague(Colleague colleague) {
		colleagueMap.put(colleague.getName().colleague);
	}
	
	public int consultation(Colleague colleagueInLove, Colleague secretLover) {
		int possibility = 0;
		return possibility;
	}
}
