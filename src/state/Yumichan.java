package state;

public class Yumichan {
	private static final int STATE_ORDINARY = 0;
	private static final int STATE_IN_BAD_MOOD = 1;
	
	private int state = -1;
	
	public void changeState(int state) {
		this.state = state;
	}
	
	public String morningGreet() {
		if(state == STATE_ORDINARY) {
			return "おっす!";
		} else if(state == STATE_IN_BAD_MOOD) {
			return "おお!";
		} else {
			return "";
		}
	}
	
	public String getProtectionForCold() {
		if(state == STATE_ORDINARY) {
			return "走る";
		} else if(state == STATE_IN_BAD_MOOD) {
			return "ももひきをはく";
		} else {
			return "";
		}
	}
}
