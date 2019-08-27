package superclass_inheritance_test;

public abstract class Creature {
	protected String name;
	protected int weight;
	protected String sound;
	/* Every method marked as abstract must be overridden. */
	public abstract void setName(String newName);
	public abstract String getName();
	public abstract void setWeight(double newWeight);
	public abstract double getWeight();
}
