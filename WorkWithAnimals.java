package superclass_inheritance_test;

public class WorkWithAnimals {
	
	int num2 = 2; // See Line 36
	
	public static void main(String[] args) {
		Dog fido = new Dog(); // calls constructor file to initialize Fido
		fido.setName("Fido");
		System.out.println(fido.getName()); // check that name set stuck
		fido.digHole();
		fido.setWeight(-1); // tests Fido for negative/zero weight
		
		int num = 9;
		fido.changeVar(num); // shows that everything is passed inside of Java
		System.out.println("randNum after method call: " + num);
		
		changeObjectName(fido);
		System.out.println("Dog's name after method call: " + fido.getName());
		
		Animal puppy = new Dog(); // We create a new object from our subclass object.
		Animal kitten = new Cat();
		System.out.println("Puppy says " + puppy.getSound()); // We call our new object from our subclass object.
		System.out.println("Kitty says " + kitten.getSound());
		
		Animal[] animals = new Animal[4]; // Can draw values and methods of objects from arrays as well.
		animals [0] = puppy;
		animals [1] = kitten;
		System.out.println("Puppy says " + animals[0].getSound());
		System.out.println("Kitty says " + animals[1].getSound());
		
		speakAnimal(puppy); // Sends animal object for processing inside of a method.
		
		((Dog)puppy).digHole(); // References method digHole() outside of the Animal superclass by casting it to be a Dog object.
		
		// System.out.println(num2); // Cannot use non-static methods or variables in a static function.
		
		fido.accessPrivate();
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Girard");
		System.out.println(giraffe.getName());
	}

	public static void changeObjectName(Dog fido) {fido.setName("Bobby");}
	
	public static void speakAnimal(Animal randAnimal) { // Create parameter randAnimal for sole use within speakAnimal method.
		System.out.println("Animal says" + randAnimal.getSound()); // Any Animal object can be passed through this method and it will automatically call this getSound method. HOWEVER, you cannot reference fields or methods outside of the Animal superclass such as Dog.digHole().
	}
	
} // source: https://www.youtube.com/watch?v=vNHpsC5ng_E&list=PLF206E906175C7E07&index=1
