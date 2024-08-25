import java.util.*;

abstract class Pet {
	public abstract void petSound();
	String petName = "";
	Scanner input = new Scanner(System.in);
	
	public void getName() {
		System.out.println("What is your pets name? ");
		petName = input.nextLine();
	}
}

class Dog extends Pet{
	public void petSound() {
		System.out.println("Your dog barks.");
	}

	public void goodDog() {
		System.out.println(petName + " is a good dog!");
	}
}

class Cat extends Pet {
	public void petSound() {
		System.out.println("Your cat meows.");
	}

	public void sassyCat() {
		System.out.println(petName + " is a mischevious kitty!");
	}
}

class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String petType = "";

		int i = 0;
		while (i == 0) {
			System.out.println("Do you have a dog or cat? ");
            petType = input.nextLine();

			petType = petType.toLowerCase();

			if (petType.equals("dog")) {
				i = 1;
            } else if (petType.equals("cat")) {
             	i = 1;
            } else {
				System.out.println("Pet type not recognized. Try again.");
			}
		}

		if (petType.equals("dog")) {
			Dog myDog = new Dog();
			myDog.getName();
			myDog.petSound();
			myDog.goodDog();
		} else {
			Cat myCat = new Cat();
			myCat.getName();
			myCat.petSound();
			myCat.sassyCat();
		}

	}
}
