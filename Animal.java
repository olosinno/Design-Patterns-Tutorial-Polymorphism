package superclass_inheritance_test;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public void setName(String newName) {name = newName;} // setter method
	public String getName() {return name;} // getter method
	
	public void setWeight (int newWeight) {if (newWeight > 0) weight = newWeight; else System.out.println("Weight cannot be zero.");}
	public int getWeight() {return weight;}
	
	public void setSound(String newSound) {sound = newSound;}
	public String getSound() {return sound;}
}
