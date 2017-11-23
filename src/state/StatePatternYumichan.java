package state;

public class StatePatternYumichan {
	private State state = null;
	
	private void changeState(State state) {
		this.state = state;
	}
	
	public String morningGreet() {
		return this.state.morningGreet();
	}
	
	public String getProtectionForCold() {
		return this.state.getProtectionForCold();
	}
}
