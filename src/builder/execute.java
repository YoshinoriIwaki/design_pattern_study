package builder;

public class execute {
	Builder builder = new SaltWaterBuilder();
	Director dir = new Director(builder);
	dir.constract();
	SaltWater saltWater = (SaltWater)builder.getResult();
}
