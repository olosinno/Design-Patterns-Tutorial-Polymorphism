package superclass_inheritance_test;

public class Dog extends Animal {
	public void digHole() {System.out.println("Dug a hole...");}

	public Dog() {
		super();
		setSound("Bark!");
	}
	
	public void changeVar(int num) {
		num = 12;
		System.out.println("randNum in method: " + num);
		}
	
	private void bePrivate() { // You cannot call a private method even if you define it inside of a subclass...
		System.out.println("In a private method!");
	}
	public void accessPrivate() {bePrivate();} // ...except this way.
}
