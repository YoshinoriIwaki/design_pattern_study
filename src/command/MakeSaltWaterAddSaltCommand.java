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
		
		System.out.println("�H���������A����ɐH����1g�������ĖO�a�H������������");
		beaker.note();
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}
}
