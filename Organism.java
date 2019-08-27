package superclass_inheritance_test;

public interface Organism { // all interface methods are automatically abstract, making adding the abstract keyword redundant
	public void setName(String newName);
	public String getName();
	
	public void setHeight(double newHeight);
	public double getHeight();
	
	public void setWeight(double newWeight);
	public double getWeight();
	
	public void setSpeed(double newSpeed);
	public double getSpeed();
	
	public void setSound(String newSound);
	public String getSound();
}
