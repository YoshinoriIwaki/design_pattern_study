package command;

public class AddSaltCommand extends Command {
	public void execute() {
		while(beaker.isMelted()) {
			beaker.addSalt(1);
			beaker.mix();
		}
		
		System.out.println("水を10gずつ加える実験");
		beaker.note();
	}
}
