package command;

import java.util.List;

public class MakeSaltWaterAddSaltCommand extends Command {
	private List<Command> commands = new LinkedList<Command>();
	
	public void execute() {
		Iterator<Command> iterator = commands.iterator();
		Command command = null;
		while(iterator.hasNext()) {
			command = iterator.next();
			command.execute();
		}
		
		System.out.println("食塩水を作り、それに食塩を1gずつ加えて飽和食塩水を作る実験");
		beaker.note();
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}
}
