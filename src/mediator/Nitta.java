package mediator;

public class Nitta implements Colleague {
	private String name = "êVìc";
	private int tension;
	private Colleague secretLover = null;
	private LoveMediator mediator = new Saito();
	
	public String getName() {
		return name;
	}
	
	public void setSecretLover(Collegue collegue) {
		this.secretLover = collegue;
	}
	
	public void needsAdvice() {
		this.tension = mediator.consultation(this, secretLover);
	}
}
