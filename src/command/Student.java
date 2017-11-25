package command;

public class Student {

	public static void main(String[] args) {
		Command makeSaltWater = new MakeSaltWaterCommand();
		Command addSalt = new AddSaltCommand();
		
		MakeSaltWaterAddSaltCommand makeSaltWaterAddSalt = new MakeSaltWaterAddSaltCommand();
		
		Beaker beaker = new Beaker(90, 10);
		makeSaltWater.setBeaker(beaker);
		addSalt.setBeaker(beaker);
		makeSaltWaterAddSalt.setBeaker(beaker);
		
		makeSaltWaterAddSalt.addCommand(makeSaltWater);
		makeSaltWaterAddSalt.addCommand(addSalt);
		
		makeSaltWaterAddSalt.execute();
		
//		Command addWater = new AddWaterCommand();
//		Command makeSaltWater = new MakeSaltWaterCommand();
//		
//		addSalt.setBeaker(new Beaker(100, 0));
//		addWater.setBeaker(new Beaker(0, 10));
//		makeSaltWater.setBeaker(new Beaker(90, 10));
//		
//		addSalt.execute();
//		addWater.execute();
//		makeSaltWater.execute();
		
//		// TODO Auto-generated method stub
//		Beaker beaker = new Beaker(100, 0);
//		beaker.experiment(Beaker.ADD_SALT);
//		
//		Beaker beaker2 = new Beaker(0, 10);
//		beaker2.experiment(Beaker.ADD_WATER);
//		
//		Beaker beaker3 = new Beaker(90, 10);
//		beaker3.experiment(Beaker.MAKE_SALT_WATER);
	}

}
