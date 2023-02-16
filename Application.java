/**
 * This is an interface for lockable objects
 * @author Kirin Sharma
 * @version 1.0
 * Lab 2
 * CS131ON
 */

public class Application {

	public static void main(String[] args)
	{
		
		Wizard myWizard = new Wizard("Dumbledore");
		myWizard.setName("Harry");
		myWizard.setHealth(1000);
		myWizard.setKey(5);
		
		System.out.println("Name of the wizard: " + myWizard.getName());
		System.out.println("Health: " + myWizard.getHealth());
		System.out.println("Key: " + myWizard.getKey());
		System.out.println("Locked: " + myWizard.isLocked());
		
		myWizard.takeDamage(175);
		System.out.println("\nOuch, you got attacked!\nRemaining health: " + myWizard.getHealth());
		
		myWizard.lock(5);
		System.out.println("\nLocked: " + myWizard.isLocked());
		myWizard.takeDamage(500);
		System.out.println("You can't be attacked with your protection spell!\n"
				+ "Remaining health: " + myWizard.getHealth());
		
		myWizard.unlock(5);
		System.out.println("\nLocked: " + myWizard.isLocked());
		myWizard.takeDamage(125);
		System.out.println("Ouch, you got attacked!\nRemaining health: " + myWizard.getHealth());
		
		System.out.println("\ntoString method: " + myWizard.toString());
		
	} // end main
	
} // end class
