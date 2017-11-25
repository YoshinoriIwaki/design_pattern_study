package command;

public class AddSaltCommand extends Command {
	public void execute() {
		while(beaker.isMelted()) {
			beaker.addSalt(1);
			beaker.mix();
		}
		
		System.out.println("…‚ğ10g‚¸‚Â‰Á‚¦‚éÀŒ±");
		beaker.note();
	}
}
